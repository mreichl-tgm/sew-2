package sew;

import java.awt.*;
import javax.swing.*;

class Fontlist extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        setLayout(new BorderLayout());
        
        // Helping var
        String[] ary = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        int x = 0;
        for (String i : ary) {
            x += 20;
            g.setFont(Font.decode(i));
            g.drawString(i, 5, x);
        }
    }
}