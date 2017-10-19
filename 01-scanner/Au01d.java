/*
 *  Datei: Au01d 
 *  Autor: mreichl
 *  Datum: 18.09.14
 *  
 *  Der Benutzer ein Wort ein welches er dann mit der Anzahl der jeweiligen Zeichen untereinander aufgelistet bekommt.
 *  Dies Funktioniert indem in einer for-Schleife je nach Länge des Textes (mit der Funktion single) getestet
 *  wird ob die erste Position des Zeichens auch der letzten entspricht.
 *  Solange single "false" ausgibt wird der letzte Fall des Zeichens gelöscht und 1 zur Variable "anzahlZeichen"
 *  hinzugefügt. Danach wird der aktuelle Char mit anzahlZeichen zusammen ausgegeben und anzahlZeichen wieder
 *  zurückgesetzt.
 */

import java.util.*;
public class Au01d 
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Eingabe:");
        String eingabe = s.nextLine();
        
        for(int i = 0; i < eingabe.length(); i++)
        {
            //Die Funktion single prüft ob die erste und letzte Position des Buchstaben übereinstimmen.
            //Trifft single nicht zu werden die überflüssigen Exemplare vor der Ausgabe gezählt und entfernt.
            while(!single(eingabe, i))
            {
                eingabe = eingabe.substring(0, lastPos(eingabe, i)) + (eingabe.substring(lastPos(eingabe, i) + 1, eingabe.length()));
            }
            System.out.println(""+eingabe.charAt(i)+"");
        }
    }
    //Prüft ob die erste und letzte Position des Buchstaben übereinstimmen.
    public static boolean single(String s1, int i)
    {
        if(s1.indexOf(s1.charAt(i)) == s1.lastIndexOf(s1.charAt(i))) return true;
        return false;
    }
    //Sucht die letzte Position des Buchstaben.
    public static int lastPos(String s1, int i)
    {
        int j = (s1.lastIndexOf(s1.charAt(i)));
        return j;
    }
}