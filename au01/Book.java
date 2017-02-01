package au01;

/**
 * @author re1
 */

public class Book {
    private Entry[] phonebook;
    
    public Book() {
        this.phonebook = new Entry[0];
    }
    
    public Entry[] getBook() {
        return this.phonebook;
    }
    
    public void setBook(Entry[] phonebook) {
        this.phonebook = phonebook;
    }
}