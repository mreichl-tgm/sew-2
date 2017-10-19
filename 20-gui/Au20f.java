package sew;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.*;

public class Au20f extends JPanel {
    private final Dimension size;
    
    private Au20f(Dimension size) {
        this.size = size;
    }
    
    public static void main(String args[]) {         
        JFrame f = new JFrame("Hallo swing");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         
        f.setSize(1000,750);
        f.add(new Au20f(f.getSize()));
        f.setVisible(true);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        //Asks if height or width is dominating
        int dm;
        if (size.getHeight() < size.getWidth()) {
            dm = (int)size.getHeight();
        } else {
            dm = (int)size.getWidth();
        }
        
        super.paintComponent(g);
        g.fillOval(50, 50, dm - 100, dm - 100);
        g.setColor(Color.white);
        g.drawLine(50, 50, dm / 2, 50);
        g.drawLine(50, 50, dm / 2, 50);
    }
    
    private class ichBinEinActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == __) {
                g.repaint();
            }
            
            }
        }
    }
}