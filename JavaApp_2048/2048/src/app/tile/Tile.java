package app.tile;

import java.awt.Color;

public class Tile {
    int value;
    Color tileColor;
    
    public Tile(){
        value = 0;
    }
    
    public Tile(int number){
        value = number;
    }
    
    public int getTileValue(){
        return value;
    }
    
    public void setTileValue(int value){
        this.value = value;
    }
    
    public void setColor(){
        switch (this.getTileValue()) {
            case 2:
                tileColor = new Color(255, 250, 201);
                break;
            case 4:
                tileColor = new Color(226, 255, 201);
                break;
            case 8:
                tileColor = new Color(201, 255, 236);
                break;
            case 16:
                tileColor = new Color(201, 241, 205);
                break;
            case 32:
                tileColor = new Color(226, 201, 255);
                break;
            case 64:
                tileColor = new Color(255, 201, 245);
                break;
            case 128:
                tileColor = new Color(168, 255, 132);
                break;
            case 256:
                tileColor = new Color(254, 255, 201);
                break;
            case 512:
                tileColor = new Color(90, 63, 63);
                break;
            default:
                tileColor = new Color(187, 252, 255);
                break;
        }
    }
    
    public Color getColor(){
        this.setColor();
        return tileColor;
    }
}
