package sew;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class Au20d extends JPanel {
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
    
    public static void main(String args[]) {         
        JFrame f = new JFrame("Hallo swing");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         
        f.setSize(1000,750);
        f.add(new Au20d());
        f.setVisible(true);
    }
}