package au01_reichl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author Markus Reichl
 * @version 2015-09-14
 * 
 * Ich bin ein Telefonbuch und verwalte die Kontaktliste,
 * sowie alle Funktionen um diese zu bearbeiten.
 */

public class Phonebook {
    private ArrayList<Contact> pb;
    
    public Phonebook() {
        pb = new ArrayList<Contact>();
    }
    
    Scanner scnr = new Scanner(System.in);
    
    /**
     * 
     * @param fn
     * @param ln
     * @param pn
     * Adds a Contact to our current phonebook list!
     */
    void addContact(String fn, String ln, String pn) {
        pb.add(new Contact(fn, ln, pn));
    }

    /**
     * Removes a Contact Object from our list.
     * @param s
     * @return If successfull String "He is alive" else "Name + has vanished"
     */
    String removeContact(String s) {
        String id = "";
        
        for (Contact c : pb) {
            if ((c.firstName + " " + c.lastName).equals(s)) {
                id = c.firstName + " " + c.lastName;
                pb.remove(c);
                break;
            }
        }
        
        if (id.equals("")) {
            return "Damn him, he's still alive!";
        } else {
            return id + " has vanished!";
        }
    }

    /**
     * Prints a given Contact with Method showContact(String s)
     * @param s
     * @return If successfull found "Found Something else "Nobody Found"
     */
    ArrayList<Contact> findContact(String s) {
        int i = 0;
        ArrayList<Contact> pBuffer = new ArrayList<Contact>();
        for (Contact c: pb) {
            if (c.firstName.contains(s)) {
                pBuffer.add(c);
                i++;
            } else if (c.lastName.contains(s)) {
                pBuffer.add(c);
                i++;
            } else if (c.number.contains(s)) {
                pBuffer.add(c);
                i++;
            }
        }
        if (i == 0) {
            return null;
        } else {
            return pBuffer;
        }
    }

    /**
     * @return Phonebook as List
     * Returns our Phonebook as List
     */
    ArrayList<Contact> showBook() {
        return pb;
    }
    
    // Sorts our phonebook by firstnames for a better view!
    void sortBook() {
        Collections.sort(pb, (Contact c1, Contact c2) -> {
            return c1.firstName.compareTo(c2.firstName);
        });
    }
}