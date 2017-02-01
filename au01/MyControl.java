package au01;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 * @author re1
 */

public class MyControl {
    public void addEntry(Book b) {
        String firstName = JOptionPane.showInputDialog("First Name:");
        String secondName = JOptionPane.showInputDialog("Second Name:");
        String phonenumber = JOptionPane.showInputDialog("Phonenumber:"); 
       
        Entry[] phonebook = new Entry[b.getBook().length + 1];
        for (int i = 0; i < b.getBook().length; i += 1) {
            phonebook[i] = b.getBook()[i];
        }
        phonebook[b.getBook().length] = new Entry(firstName, secondName, phonenumber);
    }
    
    public void removeEntry(Book b) {
        
    }
    
    public void showBook(Book b) {
        Entry[] arr = b.getBook();
        
        if (JOptionPane.showConfirmDialog(null, "Sort?") == 0) {
            Arrays.sort(arr);
        }
        
        for(int i = 0; i < arr.length; i += 1) {
            System.out.println(arr[i].getFirstName() + arr[i].getSecondName());
            System.out.println(arr[i].getNumber());
        }
    }
    
    public void showEntry(Book b, String s) {
        Entry[] phonebook = b.getBook();
    }
}