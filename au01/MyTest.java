package au01;

/**
 * @author re1
 */

import javax.swing.JOptionPane;

public class MyTest {
    public static void main(String[] args) {
        MyControl c = new MyControl();
        Book b = new Book();
        
        boolean quit = false;
        while (!quit) {
            String s = JOptionPane.showInputDialog("Type: Show, Add, Remove or Quit");
            switch(s) {
                case "Show": 
                    c.showBook(b);
                    break;
                case "Add": 
                    c.addEntry(b);
                    break;
                case "Remove": 
                    c.removeEntry(b);
                    break;
                case "Quit": 
                    quit = true;
            }
        }
    }
}