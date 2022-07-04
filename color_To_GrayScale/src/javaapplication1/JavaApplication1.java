package javaapplication1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class JavaApplication1 {
    public static void main(String[] args) throws IOException {
        File f = new File("src/lena.jpg");
        BufferedImage bi = ImageIO.read(f);   
        int width = bi.getWidth();
        int height = bi.getHeight();
        
        for(int i=0; i<width; i++){
            for(int j=0; j<height; j++){
                int p = bi.getRGB(i, j); 
                int r = (p >> 16) & 0xff; 
                int g = (p >> 8) & 0xff;
                int b = p & 0xff;      
                int avg = (r + g + b) / 3;
                
                p = (avg << 16) | (avg << 8) | avg;
                bi.setRGB(i, j, p);
            }
        }
        f = new File("src/lena_2.jpg");
        ImageIO.write(bi, "jpg", f);
    }
    
}
