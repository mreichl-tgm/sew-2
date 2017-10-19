package sew;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.util.Random;
import javax.swing.*;

public class au20e extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        int x = 0;
        int y = 0;
        int a = 10;
        int b = 10;
        Random rand = new Random();

        while(y < 750) {
            if (x <= 1000) {
                x += 10;
            } else {
                x = 0;
                y += 10;
            }
            
            g.setColor(new Color(rand.nextInt(255) ,rand.nextInt(255) ,rand.nextInt(255)));
            g.fillRect(x, y, a, b);
        }
    }
    
    public static void main(String args[]) {         
        JFrame f = new JFrame("Hallo swing");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         
        f.setSize(1000,750);
        f.add(new au20e());
        f.setVisible(true);
    }
}