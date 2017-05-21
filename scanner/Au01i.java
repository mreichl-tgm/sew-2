/**
 * Au01i
 * 
 * @mreichl
 * @09.10.14
 */

import javax.swing.JOptionPane;
public class Au01i
{
   public static void main() 
   {
       String eingabe = "";
       int zahl = 0;
       do {
           eingabe = JOptionPane.showInputDialog("Bitte Monat in Zahlen eingeben:");
           zahl = eingabe.parseInt();
           System.out.println(""+monatsname(zahl)+"");
       } while(eingabe.parseInt() < 1 && eingabe.parseInt() > 12);
   }
   
   public static String monatsname(int i) 
   {
       switch(i)
       {
           case 1: monatsname = "Januar";
                   break;
           case 2: monatsname = "Februar";
                   break;
           case 3: monatsname = "März";
                   break;
           case 4: monatsname = "April";
                   break;
           case 5: monatsname = "Mai";
                   break;
           case 6: monatsname = "Juni";
                   break;
           case 7: monatsname = "Juli";
                   break;
           case 8: monatsname = "August";
                   break;
           case 9: monatsname = "September";
                   break;
           case 10: monatsname = "Oktober";
                   break;
           case 11: monatsname = "November";
                   break;
           case 12: monatsname = "Dezember";
                   break;
           default: monatsname = "Ungültig";
       }
       return monatsname;
   }
}
