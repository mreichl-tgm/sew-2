package sew;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

class Barcode extends JPanel {    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        short x = 50;
        short y = 0;
        Random rand = new Random();
        
        while(x < 50 || y < 200) {
            y += rand.nextInt(10);
            System.out.print(y);
            g.drawLine(y + 50 ,50 , y + 50, 200);
        }
    }
}