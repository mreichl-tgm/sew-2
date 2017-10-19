package sew;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

class Colors1024 extends JPanel {
    private int x = 0;
    private int y = 0;
    private final int z;
    private final int height;
    private final int width;
    
    public Colors1024(Dimension size, int rectSize) {
        height = (int)size.getHeight(); 
        width = (int)size.getWidth();
        z = rectSize;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Random rand = new Random();
        
        for (int i = 0; i < width / z; i++) {
            for (int j = 0; j < height / z; j++) {
                g.setColor(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
                g.fillRect(x, y, z, z);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, z, z);
                y += z;
            }
            y = 0;
            x += z;
        }
    }
}