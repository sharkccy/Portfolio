import csv
import numpy as np
from tqdm import tqdm

import torch
from torch import nn, optim
from torch.utils.data import DataLoader

from model import Transformer, ShuttleFold
from utils import BadmintonDataset

device = "cuda:0"

train_path = "./data/train.csv"
train_dataset = BadmintonDataset(train_path)
train_dataloader = DataLoader(dataset = train_dataset, batch_size = 32)

model = ShuttleFold().to(device)

mae = nn.L1Loss()
cross = nn.CrossEntropyLoss()
optimizer=optim.Adam(model.parameters(), lr=1e-3)

loss_list = []
for epoch in range(300):
    total_loss = 0.0
    for batch, sequence in enumerate(train_dataloader):
        in_shot, in_x, in_y, in_player, out_shot, out_x, out_y, out_player  = sequence
        pred_shot, pred_coordinate = model(in_shot.to(device), in_x.to(device), in_y.to(device), in_player.to(device))
        
        idx_list = []
        for batch in in_shot:
            for idx, shot in enumerate(batch):
                if shot==0: 
                    idx_list.append(idx-1)
                    break
        true_shot = []
        true_coordinate = []
        for i, idx in enumerate(idx_list): 
            true_shot.append(out_shot[i][idx])
            true_coordinate.append([out_x[i][idx], out_y[i][idx]])
        true_shot = torch.Tensor(true_shot).to(device)
        true_coordinate = torch.Tensor(true_coordinate).to(device)
        
        loss = cross(pred_shot, true_shot.long()) + mae(pred_coordinate[:][0], true_coordinate[:][0]) + mae(pred_coordinate[:][1], true_coordinate[:][1])
        loss.backward()
        optimizer.step()
        optimizer.zero_grad()
        total_loss += loss.item()
    print("Epoch{}: {}".format(epoch, total_loss))
    loss_list.append(total_loss)
    torch.save(model.state_dict(), "./checkpoint/{}.pt".format(epoch))
    
import matplotlib.pyplot as plt
plt.title("ShuttleFold-no recycle")
plt.plot(loss_list, label='loss')
plt.xlabel("n iteration")
plt.legend(loc='upper left')
plt.savefig("ShuttleFold-no recycle" + ".png")