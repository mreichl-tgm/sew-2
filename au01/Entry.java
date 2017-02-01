package au01;

/**
 * @author re1
 */

public class Entry {
    private String firstName;
    private String secondName;
    private String phonenumber;
    
    public Entry(String firstName,String secondName,String phonenumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.phonenumber = phonenumber;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public String getSecondName() {
        return this.secondName;
    }
    
    public String getNumber() {
        return this.phonenumber;
    }
}