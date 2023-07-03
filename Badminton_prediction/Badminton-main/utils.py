import torch
import numpy as np
import pandas as pd
from torch.utils.data import Dataset

class BadmintonDataset(Dataset):
    def __init__(self, path):
        super().__init__()
        self.data = pd.read_csv(path)
        codes_type, uniques_type = pd.factorize(self.data['type'])
        self.data['type'] = codes_type + 1
        self.data['player'] = self.data['player'].apply(lambda x: x+1) 
        self.max_ball_round = 70
        group = self.data[['rally_id', 'ball_round', 'type', 'landing_x', 'landing_y', 'player', 'set' , 'rally_length']].groupby('rally_id').apply(lambda r: (r['ball_round'].values, r['type'].values, r['landing_x'].values, r['landing_y'].values, r['player'].values, r['set'].values, r['rally_length'].values))

        self.sequences, self.rally_ids , self.rally_lengths= {}, [], []
        for i, rally_id in enumerate(group.index):
            ball_round, shot_type, landing_x, landing_y, player, sets, length = group[rally_id]
            self.sequences[rally_id] = (ball_round, shot_type, landing_x, landing_y, player, sets)
            self.rally_ids.append(rally_id)
            self.rally_lengths.append(length[0])

    def __len__(self):
        return len(self.sequences)
    
    def __getitem__(self, index):
        rally_id = self.rally_ids[index]
        ball_round, shot_type, landing_x, landing_y, player, sets = self.sequences[rally_id]

        pad_input_shot = np.full(self.max_ball_round, fill_value=0, dtype=int)
        pad_input_x = np.full(self.max_ball_round, fill_value=0, dtype=float)
        pad_input_y = np.full(self.max_ball_round, fill_value=0, dtype=float)
        pad_input_player = np.full(self.max_ball_round, fill_value=0, dtype=int)
        pad_output_shot = np.full(self.max_ball_round, fill_value=0, dtype=int)
        pad_output_x = np.full(self.max_ball_round, fill_value=0, dtype=float)
        pad_output_y = np.full(self.max_ball_round, fill_value=0, dtype=float)
        pad_output_player = np.full(self.max_ball_round, fill_value=0, dtype=int)

        if len(ball_round) > self.max_ball_round:
            rally_len = self.max_ball_round

            pad_input_shot[:] = shot_type[0:-1:1][:rally_len]                                   # 0, 1, ..., max_ball_round-1
            pad_input_x[:] = landing_x[0:-1:1][:rally_len]
            pad_input_y[:] = landing_y[0:-1:1][:rally_len]
            pad_input_player[:] = player[0:-1:1][:rally_len]
            pad_output_shot[:] = shot_type[1::1][:rally_len]                                    # 1, 2, ..., max_ball_round
            pad_output_x[:] = landing_x[1::1][:rally_len]
            pad_output_y[:] = landing_y[1::1][:rally_len]
            pad_output_player[:] = player[1::1][:rally_len]
        else:
            rally_len = len(ball_round) - 1                                                     # 0 ~ (n-2)
            
            pad_input_shot[:rally_len] = shot_type[0:-1:1]                                      # 0, 1, ..., n-1
            pad_input_x[:rally_len] = landing_x[0:-1:1]
            pad_input_y[:rally_len] = landing_y[0:-1:1]
            pad_input_player[:rally_len] = player[0:-1:1]
            pad_output_shot[:rally_len] = shot_type[1::1]                                       # 1, 2, ..., n
            pad_output_x[:rally_len] = landing_x[1::1]
            pad_output_y[:rally_len] = landing_y[1::1]
            pad_output_player[:rally_len] = player[1::1]
        
        pad_input_shot = torch.Tensor(pad_input_shot)
        pad_input_x = torch.Tensor(pad_input_x)
        pad_input_y = torch.Tensor(pad_input_y)
        pad_input_player = torch.Tensor(pad_input_player)
        pad_output_shot =torch.Tensor(pad_output_shot)
        pad_output_x = torch.Tensor(pad_output_x)
        pad_output_y = torch.Tensor(pad_output_y)
        pad_output_player = torch.Tensor(pad_output_player)

        return (pad_input_shot, pad_input_x, pad_input_y, pad_input_player,
                pad_output_shot, pad_output_x, pad_output_y, pad_output_player)

