/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author student
 */
public class Calc implements java.io.Serializable {
    private int x;
    private int y;
    private int sum;
    public Calc() {
        x=0;
        y=0;
        sum=0;
    }

    public void calcTotal() {
        sum=x+y;
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
    
    
    
}
