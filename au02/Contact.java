package au01_reichl;

/**
 * @author Markus Reichl
 * @version 2015-09-14
 * 
 * Ich bin ein Kontakt bestehend aus Vorname, Nachname und Nummber als String.
 * Getter und Setter werden nicht benötigt.
 */

class Contact {
    protected String firstName;
    protected String lastName;
    protected String number;
    
    public Contact(String fn, String ln, String pn) {
        this.firstName = fn;
        this.lastName = ln;
        this.number = pn;
    }
}