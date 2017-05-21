/**
 * AU01 Wiederholung
 * 
 * @mreichl
 * @18.09.14
 */
import java.util.*;
public class Au01b {
    public static void main() {
        Scanner s = new Scanner(System.in);
        
        while(true) {            
            System.out.println("Bitte geben Sie einen Text ein");
            String eingabe = s.nextLine();
            if(eingabe.equals("Quit")){
                break;
            }
            if(eingabe.length() < 20){
                System.out.println("Bitte nutzen sie mehr als 20 Zeichen!");
            }else{
                System.out.println(""+eingabe.toUpperCase()+"");
            }
        }
    }
}