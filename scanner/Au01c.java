/**
 * AU01 Wiederholung
 * 
 * @mreichl
 * @18.09.14
 */
import java.util.*;
public class Au01c {
    public static void main() {
        Scanner s = new Scanner(System.in);
        
        while(true) {            
            System.out.println("Bitte geben Sie ihren Namen wie folgt ein: Max Mustermann");
            String eingabe = s.nextLine();
            String vorname = eingabe.substring(0,1);
            String nachname = eingabe.substring(eingabe.indexOf(" ") + 1);
            System.out.println(""+vorname.toLowerCase()+""+nachname.toLowerCase()+"@tgm.ac.at");
        }
    }
}