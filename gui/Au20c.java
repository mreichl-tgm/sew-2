package sew;

import javax.swing.JFrame;

public class Au20c {
    public static void main(String[] args) {
        JFrame f = new JFrame("Au20c");
        f.setSize(1000, 750);
        
        // Here I add elements
        f.add(new Fontlist());
        
        f.setDefaultCloseOperation(1);
        f.setVisible(true);
    }
}