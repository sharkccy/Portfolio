/*
Project Architecture/Acknowledgement:
https://www.instructables.com/Program-Your-Own-2048-Game-WJava/
by Pranay Tiru
Implementation/improvement: Vincent Chang
*/
package app.game;

import app.board.Board;
import app.tile.Tile;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JPanel implements KeyListener{
    Board currentGame = new Board();
    static Game newGame = new Game();
    
    static JFrame frame = new JFrame("2048");
    static Color color;
    String gameBoard = currentGame.toString();
    
    public static void setUpGUI(){
        frame.addKeyListener(newGame);
        frame.getContentPane().add(newGame);
        frame.setSize(600,400);
        frame.setVisible(true);
        frame.setResizable(false);
    }
    
    @Override
    public void keyPressed(KeyEvent k){
        if(k.getKeyChar() == 'w' || k.getKeyCode() == KeyEvent.VK_UP){
            currentGame.up();
            currentGame.spawn();
            gameBoard = currentGame.toString();
            frame.repaint();
        }       
        else if(k.getKeyChar() == 'a' || k.getKeyCode() == KeyEvent.VK_LEFT){
            currentGame.left();
            currentGame.spawn();
            gameBoard = currentGame.toString();
            frame.repaint();
        }        
        else if(k.getKeyChar() == 's' || k.getKeyCode() == KeyEvent.VK_RIGHT){
            currentGame.right();
            currentGame.spawn();
            gameBoard = currentGame.toString();
            frame.repaint();
        }        
        else if(k.getKeyChar() == 'd' || k.getKeyCode() == KeyEvent.VK_DOWN){
            currentGame.down();
            currentGame.spawn();
            gameBoard = currentGame.toString();
            frame.repaint();
        }
        else if(k.getKeyCode() == KeyEvent.VK_ENTER){
            currentGame = new Board();           
            currentGame.spawn();
            currentGame.spawn();            
            frame.repaint();
        }
    }
    
    @Override
    public void keyTyped(KeyEvent e) {       
        
    }
    
    @Override
    public void keyReleased(KeyEvent e) {

    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        Font font = new Font("SANS_SERIF", Font.PLAIN,18);
        g2D.setFont(font);
        g2D.drawString("2048", 240 , 20);
        g2D.drawString("Score: " + currentGame.getScore(),150-4*String.valueOf(currentGame.getScore()).length(), 40);
        g2D.drawString("Hightest Tile: " + currentGame.getHighestTile(),280-4*String.valueOf(currentGame.getHighestTile()).length(), 40);
        g2D.drawString("Press Enter to Start", 185, 315);
        g2D.drawString("Use WASD or Arrow keys to move", 130, 335);
        if ( currentGame.isFull())
        {
            g2D.drawString( "Press 'Enter' to restart", 180, 355 );
        }
        g2D.setColor(Color.gray);
        g2D.fillRect(140, 50, 250, 250);
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                drawTiles(g,currentGame.board[i][j], j*60+150, i*60+60);
            }
        }
        if(currentGame.isOver()){
            g2D.drawString( "Press 'Enter' to restart", 180, 355 );     
            g.setColor(Color.gray);
            g2D.fillRect(140, 50, 250, 250);
            for(int i = 0; i < 4; i++){
                for(int j = 0; j < 4; j++){
                    g2D.setColor(Color.ORANGE);
                    g2D.fillRoundRect(j*60+150, i*60+60, 50, 50, 5, 5);
                    g2D.setColor(Color.black);
                    g.drawString("Game", j*60+150, i*60+85);
                    g.drawString("Over", j*60+155, i*60+105);
                }
            }
        }

    }
    
    public void drawTiles(Graphics g, Tile tile, int x, int y){
        int tileValue = tile.getTileValue();
        int length = String.valueOf(tileValue).length();
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.lightGray);
        g2D.fillRoundRect(x, y, 50, 50, 5, 5);
        g2D.setColor(Color.black);
        if(tileValue != 0){
            g2D.setColor(tile.getColor());
            g2D.fillRoundRect(x, y, 50, 50, 5, 5);
            g2D.setColor(Color.black);
            g.drawString("" + tileValue, x + 20 - 3*length, y + 33);
        }
    }
    public static void main(String[] args) {
        setUpGUI();
    }

}
