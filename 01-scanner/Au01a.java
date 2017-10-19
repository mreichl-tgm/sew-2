/**
 * AU01 Wiederholung
 * 
 * @mreichl
 * @18.09.14
 */
import java.util.*;
public class Au01a {
    public static void main() {
        Scanner s = new Scanner(System.in);
        
        while(true) {            
            System.out.println("Bitte geben Sie einen Text ein");
            String eingabe = s.nextLine();
            System.out.println(""+eingabe.toUpperCase()+"");
        }
    }
}