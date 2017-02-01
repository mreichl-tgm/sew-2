package sew;

import javax.swing.JFrame;

public class Au20d2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Au20c");
        f.setSize(1000, 750);
        
        // Here I add elements
        f.add(new Fontlist());
        
        f.setDefaultCloseOperation(2);
        f.setVisible(true);
    }
}