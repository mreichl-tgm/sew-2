/*
 *  Datei: Au01g 
 *  Autor: mreichl
 *  Datum: 25.09.14
 */

import java.util.*;
public class Au01g 
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        String alphabet = "abcdefghijklmnopqrstuvwxyz0123456789+-*/ ,.?!";
        
        System.out.println("Eingabe:");
        String original = s.nextLine();
        String eingabe = original.toLowerCase();
        //Der String "alphabet" wird abgearbeitet und das Zeichen zusammen mit seiner Häufigkeit
        //(falls dieses vorhanden ist) ausgegeben.
        for(int i = 0; i < alphabet.length(); i++)
        {
            char zeichen = alphabet.charAt(i);
            int anzahl = anzahlZeichen(eingabe,zeichen);
            
            if(anzahl > 0)
            {
                System.out.println(""+zeichen+" "+anzahl+"x");
            }
        }
    }
    //Diese Funktion überprüft (wie in Aufgabe Au01d) wie oft das oben gesuchte Zeichen im String
    //enthalten ist. Ist es nicht enthalten liefert die Funktion den Wert 0.
    public static int anzahlZeichen(String s1, char c)
    {
        int anzahlZeichen = 1;
            while(s1.indexOf(c) != s1.lastIndexOf(c))
            {
                anzahlZeichen++;
                s1 = s1.substring(0, s1.lastIndexOf(c)) + (s1.substring(s1.lastIndexOf(c) + 1, s1.length()));
            }
            if(s1.indexOf(c) < 0) return 0;
        return anzahlZeichen;
    }
}