import csv
import numpy as np
from tqdm import tqdm

import torch
from torch import nn, optim
from torch.utils.data import DataLoader

from model import Transformer, ShuttleFold
from utils import BadmintonDataset

device = "cuda:0"

test_path = './data/val_given.csv'
test_dataset = BadmintonDataset(test_path)
test_dataloader = DataLoader(dataset = test_dataset, batch_size = 1)

model = ShuttleFold().to(device)
model.load_state_dict(torch.load("./checkpoint/288.pt"))
model.eval()
with torch.no_grad():
    prediction=[]
    for iter, sequence in enumerate(test_dataloader):
        print("Iter: {}".format(iter), end="\r")
        for sid in range(6):
            in_shot, in_x, in_y, in_player, out_shot, out_x, out_y, out_player  = sequence
            for l in range(test_dataset.rally_lengths[iter]-4):
                pred_shot, pred_coordinate = model(in_shot.to(device), in_x.to(device), in_y.to(device), in_player.to(device))
                pred_shot=pred_shot[0]
                pred_shot=nn.functional.softmax(pred_shot[1:11],dim=0)
                pred_coordinate = pred_coordinate.tolist()[0]
                idx_list = []
                for batch in in_shot:
                    for idx, shot in enumerate(batch):
                        if shot==0: 
                            idx_list.append(idx-1)
                            break
                true_shot = [[]]
                true_x = [[]]
                true_y = [[]]
                for i, idx in enumerate(idx_list): 
                    for j in range(1, idx+1):
                        true_shot[0].append(in_shot[0][j].item())
                        true_x[0].append(in_x[0][j].item())
                        true_y[0].append(in_y[0][j].item())
                true_shot[0].append(torch.argmax(pred_shot))
                true_x[0].append(pred_coordinate[0])
                true_y[0].append(pred_coordinate[1])
                for _ in range(70-len(true_shot[0])):
                    true_shot[0].append(0)
                    true_x[0].append(0)
                    true_y[0].append(0)
                in_shot = torch.Tensor(true_shot)
                in_x = torch.Tensor(true_x)
                in_y = torch.Tensor(true_y)
                out = [test_dataset.rally_ids[iter], sid, l+5, pred_coordinate[0], pred_coordinate[1],]
                out.extend(pred_shot.tolist())
                prediction.append(out)

with open('./data/prediction.csv', 'w', newline='') as submit_file:
    writer = csv.writer(submit_file)
    writer.writerow(['rally_id', 'sample_id', 'ball_round', 'landing_x', 'landing_y', 'short service', 'net shot', 'lob', 'clear', 'drop', 'push/rush', 'smash', 'defensive shot', 'drive', 'long service'])
    writer.writerows(row for row in prediction)
