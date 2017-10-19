/*
 *  Datei: Au01f 
 *  Autor: mreichl
 *  Datum: 18.09.14
 */

import java.util.*;
public class Au01f 
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Eingabe:");
        String s1 = s.nextLine();
        int anfang = 0;
        
        do {
            String wort = wortAb(s1, anfang);
            String ausgabe = "";
            if(wort.equals("daß")) ausgabe = "dass";
            if(wort.equals("Delphin")) ausgabe = "Delfin";
            if(wort.equals("radfahren")) ausgabe = "Rad fahren";
            System.out.print(""+ausgabe+" ");
            anfang = anfang + wort.length() + 1;
        } while(anfang < s1.length());
    }
    
    public static String wortAb(String text, int anfang) 
    {
        for(int i = anfang; i < text.length(); i++)
        {
            if(text.charAt(i) == ' ') return text.substring(anfang, i);
        }
        return text.substring(anfang, text.length());
    }
}