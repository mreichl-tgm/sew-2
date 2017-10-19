package sew;

import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import javax.swing.*;

public class sew_gui_class extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Ich bin ein Array", 25, 25);
        
        // Rects with String
        g.drawRect(25, 50, 150, 100);
        g.fillRect(25, 200, 150, 100);
        g.fillRect(200, 200, 150, 100);
        g.fillRect(375, 200, 150, 100);
        g.drawString("Ich bin eine Flasche", 50, 100);
        
        // Oval with String
        g.drawOval(300, 50, 250, 100);
        g.drawString("Ich bin eine Setter Methode", 350, 100);
        
        // Random Stuff
        /* g.clipRect(50, 50, 150, 150);  Match alles kaputt lel */
        g.create(); // ?
        g.draw3DRect(400, 350, 150, 150, true); // u mad?
        g.fillArc(50, 400, 100, 100, 80, 80);
        g.clearRect(100, 420, 100, 100);
        System.out.println(g.toString());
        System.out.println(GraphicsEnvironment.getLocalGraphicsEnvironment());
    }
    
    public static void main(String[] args) {
        JFrame f = new JFrame("Ich bin ein GUI");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(960, 540);
        f.add(new sew_gui_class());
        f.setVisible(true);
        if (JOptionPane.showConfirmDialog(null, JOptionPane.YES_NO_OPTION) == 0) {
            f.setSize(100, 1000);
        }
        
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 1920; i++) {
                f.setSize(i, i/2);
            }
            f.add(new sew_gui_class());
        }
    }
}