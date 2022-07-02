package app.board;

import app.tile.Tile;


public class Board {
    public Tile[][] board;   
    public int score = 0;
    int grids = 4;
    int border = 0;
    
    
    
    public Board(){
       board = new Tile[4][4];
       for(int i = 0; i < board.length; i++){
           for(int j = 0; j < board.length; j++){
               board[i][j] = new Tile();
           }
       }
    }
    
    public Tile[][] getBoard(){
        return board;
    }
    
    public int getScore(){
        return score;
    }
    
    public int getHighestTile(){
        int highest = board[0][0].getTileValue();
        for(int i = 0; i < board.length; i++){
           for(int j = 0; j < board.length; j++){
               if(board[i][j].getTileValue() > highest){
                   highest = board[i][j].getTileValue();
               }            
           }
        }
        return highest;
    }
    
    public String print(){
        String boardInstring = "";
        for(int i = 0; i < board.length; i++){
           for(int j = 0; j < board.length; j++){
               boardInstring += board[i][j].toString();
           }
           boardInstring += "\n";
        }
        return boardInstring;
    }
    
    public void spawn(){
        boolean isEmpty = true;
        while( isEmpty && (!isFull())){
            int row = (int)(Math.random() * 4);
            int col = (int)(Math.random() * 4);
            double x = Math.random();
            if( board[row][col].getTileValue() == 0){
                if(x < 0.2){
                    board[row][col].setTileValue(4);
                    isEmpty = false;
                }
                else{
                    board[row][col].setTileValue(2);
                    isEmpty = false;
                }
            }
        }
        
    }
    
    public boolean isFull(){
        for(int i = 0; i < board.length; i++){
           for(int j = 0; j < board.length; j++){
               if(board[i][j].getTileValue() == 0){
                   return false;
               }
           }
        }
        return true;
    }
    public boolean isOver(){
        for(int i = 0; i < board.length; i++){
           for(int j = 0; j < board.length; j++){
               if(board[i][j].getTileValue() == 0){
                   return false;
               }              
               else if(i == 0 && j == 0){
                   if(board[i][j].getTileValue() == board[i+1][j].getTileValue() || 
                      board[i][j].getTileValue() == board[i][j+1].getTileValue()){
                       return false;
                   }
               }
               else if(i == 0 && j == 3){
                   if(board[i][j].getTileValue() == board[i+1][j].getTileValue() || 
                      board[i][j].getTileValue() == board[i][j-1].getTileValue()){
                       return false;
                   }
               }
               else if(i == 3 && j == 0){
                   if(board[i][j].getTileValue() == board[i-1][j].getTileValue() || 
                      board[i][j].getTileValue() == board[i][j+1].getTileValue()){
                       return false;
                   }
               }
               else if(i == 3 && j == 3){
                   if(board[i][j].getTileValue() == board[i-1][j].getTileValue() || 
                      board[i][j].getTileValue() == board[i][j-1].getTileValue()){
                       return false;
                   }
               }
               else if(i == 0){
                   if(board[i][j].getTileValue() == board[i+1][j].getTileValue() || 
                      board[i][j].getTileValue() == board[i][j+1].getTileValue() ||
                      board[i][j].getTileValue() == board[i][j-1].getTileValue()){
                       return false;
                   }
               }
               else if(i == 3){
                   if(board[i][j].getTileValue() == board[i-1][j].getTileValue() || 
                      board[i][j].getTileValue() == board[i][j+1].getTileValue() ||
                      board[i][j].getTileValue() == board[i][j-1].getTileValue()){
                       return false;
                   }
               }
               else if(j == 0){
                   if(board[i][j].getTileValue() == board[i+1][j].getTileValue() || 
                      board[i][j].getTileValue() == board[i-1][j].getTileValue() ||
                      board[i][j].getTileValue() == board[i][j+1].getTileValue()){
                       return false;
                   }
               }
               else if(j == 3){
                   if(board[i][j].getTileValue() == board[i+1][j].getTileValue() || 
                      board[i][j].getTileValue() == board[i-1][j].getTileValue() ||
                      board[i][j].getTileValue() == board[i][j-1].getTileValue()){
                       return false;
                   }
               }
               else{
                   if(board[i][j].getTileValue() == board[i+1][j].getTileValue() || 
                      board[i][j].getTileValue() == board[i-1][j].getTileValue() ||
                      board[i][j].getTileValue() == board[i][j+1].getTileValue() ||
                      board[i][j].getTileValue() == board[i][j-1].getTileValue()){
                      return false;
                   }
               }
           }
        }
        return true;
    }
    
    public void up(){
        for(int i = 0; i < grids; i++){
            border = 0;
            for(int j = 0; j < grids; j++){
                if(board[j][i].getTileValue() != 0){
                    if(border <= j){
                        verticalAction(j, i, "up");
                    }
                }
            }
        }
    }
    
    public void down(){
        for(int i = 0; i < grids; i++){
            border = grids - 1;
            for(int j = grids - 1; j >= 0; j--){
                if(board[j][i].getTileValue() != 0){
                    if(border >= j){
                        verticalAction(j, i, "down");
                    }
                }
            }
        }
    }
    
    public void left(){
        for(int i = 0; i < grids; i++){
            border = 0;
            for(int j = 0; j < grids; j++){
                if(board[i][j].getTileValue() != 0){
                    if(border <= j){
                        horizontalAction(i, j, "left");
                    }
                }
            }
        }
    }
    
    public void right(){
        for(int i = 0; i < grids; i++){
            border = grids - 1;
            for(int j = grids - 1; j >= 0; j--){
                if(board[i][j].getTileValue() != 0){
                    if(border >= j){
                        horizontalAction(i, j, "right");
                    }
                }
            }
        }
    }
    
    public void horizontalAction(int row, int column, String direction){
        Tile initial = board[row][border];
        Tile comparing = board[row][column];
        if(initial.getTileValue() == 0 || initial.getTileValue() == comparing.getTileValue()){
            if(column > border || (direction.equals("right") && (column < border))){
                int addValue = initial.getTileValue() + comparing.getTileValue();
                if(initial.getTileValue() != 0){                    
                    score += addValue;
                }
                initial.setTileValue(addValue);
                comparing.setTileValue(0);
            }
        }
        else{
            if(direction.equals("right")){
                border--;
            }
            else{
                border++;
            }
            horizontalAction(row, column, direction);
        }
    }
    
    public void verticalAction(int row, int column, String direction){
        Tile initial = board[border][column];
        Tile comparing = board[row][column];
        if(initial.getTileValue() == 0 || initial.getTileValue() == comparing.getTileValue()){
            if(row > border || (direction.equals("down") && row < border)){
                int addValue = initial.getTileValue() + comparing.getTileValue();
                if(initial.getTileValue() != 0){                    
                    score += addValue;
                }
                initial.setTileValue(addValue);
                comparing.setTileValue(0);
            }
        }
        else{
            if(direction.equals("down")){
                border--;
            }
            else{
                border++;
            }
            verticalAction(row, column, direction);
        }
    }
    
    
}
