import math
import torch
from torch import nn, Tensor
from torch.nn import Linear, Embedding, TransformerEncoder, TransformerEncoderLayer, Flatten

class PositionalEncoding(nn.Module):
    def __init__(self, d_model: int, dropout: float = 0.1, max_len: int = 5000):
        super().__init__()
        self.dropout = nn.Dropout(p=dropout)
        position = torch.arange(max_len).unsqueeze(1)
        div_term = torch.exp(torch.arange(0, d_model, 2) * (-math.log(10000.0) / d_model))
        pe = torch.zeros(max_len, 1, d_model)
        pe[:, 0, 0::2] = torch.sin(position * div_term)
        pe[:, 0, 1::2] = torch.cos(position * div_term)
        self.register_buffer('pe', pe)

    def forward(self, x: Tensor) -> Tensor:
        x = x + self.pe[:x.size(0)]
        return self.dropout(x)

class Transformer(nn.Module):
    def __init__(self, input_size: int, output_size: int, dim_model: int, nun_head: int, dim_hidden: int, num_layer: int, dropout: float = 0.5):
        super().__init__()
        self.embedding = Linear(1, dim_model)
        self.pos_encoder = PositionalEncoding(dim_model, dropout)
        encoder_layers = TransformerEncoderLayer(dim_model, nun_head, dim_hidden, dropout)
        self.transformer_encoder = TransformerEncoder(encoder_layers, num_layer)
        self.dim_model = dim_model
        self.linear = Linear(dim_model*input_size, output_size)
        self.flatten = Flatten(1, -1)
        self.init_weights()

    def init_weights(self) -> None:
        initrange = 0.1
        # self.embedding.weight.data.uniform_(-initrange, initrange)
        self.linear.bias.data.zero_()
        self.linear.weight.data.uniform_(-initrange, initrange)

    def forward(self, src: Tensor, src_mask: Tensor = None) -> Tensor:
        src = torch.unsqueeze(src, dim=2)
        src = self.embedding(src)
        src = src * math.sqrt(self.dim_model)
        src = self.pos_encoder(src)
        output = self.transformer_encoder(src, src_mask)
        output = self.flatten(output)
        output = self.linear(output)
        return output

class ShuttleFold(nn.Module):
    def __init__(self):
        super().__init__()
        self.player_param = nn.Parameter(torch.ones(4, 1))
        self.pair_param = nn.Parameter(torch.ones(4, 4))
        self.cross_param = nn.Parameter(torch.ones(1, 1))
        self.player_transformer = Transformer(input_size=35, output_size=35, dim_model=16, nun_head=8, dim_hidden=8, num_layer=2, dropout=0.25)
        self.pair_transformer = Transformer(input_size=4900, output_size=4900, dim_model=16, nun_head=8, dim_hidden=8, num_layer=2, dropout=0.25)
        self.shot_linear = Linear(4900, 11)
        self.coordinate_linear = Linear(4900, 2)
        self.flatten = Flatten(1, -1)
        
    def forward(self, in_shot, in_x, in_y, in_player):
        merge = torch.cat((torch.unsqueeze(in_shot, dim=2), 
                             torch.unsqueeze(in_x, dim=2), 
                             torch.unsqueeze(in_y, dim=2), 
                             torch.unsqueeze(in_player, dim=2)), 
                            dim=2).float()
        batch = merge.shape[0]
        player = torch.squeeze(merge @ self.player_param, dim=2)
        pair = self.flatten(merge @ self.pair_param @ torch.transpose(merge, 1, 2))
        player_a = player[:, ::2]
        player_b = player[:, 1::2]
        # for _ in range(3):
        player_a = self.player_transformer(player_a)
        player_b = self.player_transformer(player_b)
        player = torch.unsqueeze(torch.stack((player_a, player_b), dim=1).transpose(1, 2).reshape(batch, -1), dim=2)
        pair = self.pair_transformer(pair)
        pair = pair + self.flatten(player @ self.cross_param @ torch.transpose(player, 1, 2))
        shot = self.shot_linear(pair.float())
        coordinate = self.coordinate_linear(pair.float())
        return shot, coordinate
