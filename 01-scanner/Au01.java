/*
 *  Datei: Au01e 
 *  Autor: mreichl
 *  Datum: 18.09.14
 */

import java.util.*;
public class Au01
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        String eingabe = s.nextLine();
        int anfang = 0;
        
        do {
            String wort = aktuellesWort(eingabe, anfang);
            int häufigkeit = wortHäufigkeit(wort, eingabe);
            
            System.out.println(""+wort+" "+häufigkeit+"x");
            anfang = anfang + wort.length() + 1;
        } while(anfang < eingabe.length());
    }    
    //Liefert das aktuelle Wort
    public static String aktuellesWort(String text, int anfang) 
    {
        for(int i = anfang; i < text.length(); i++)
        {
            if(text.charAt(i) == ' ') return text.substring(anfang, i);
        }
        return text.substring(anfang, text.length());
    }
    //Liefert Worthäufigkeit
    public static int wortHäufigkeit(String wort, String eingabe) 
    {
        int wortHäufigkeit = 1;
        int anfang = 0;
        String anfangsWort = eingabe.substring(anfang, eingabe.indexOf(' '));
        
        while(wort.length() < eingabe.length())
        {
            if(wort.equals(anfangsWort) || wort.equals(eingabe.substring(anfang, eingabe.indexOf(' ') + anfang)))
            {
                wortHäufigkeit++;
                anfang = anfangsWort.length() + wort.length();
            }
        }
        return wortHäufigkeit;
    }
}