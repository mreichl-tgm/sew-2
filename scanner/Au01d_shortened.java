import java.util.*;
public class Au01d_shortened {
    public static void main() {
        Scanner s = new Scanner(System.in);
        int anzahlZeichen = 1;        
        System.out.println("Eingabe:");
        String s1 = s.nextLine();        
        for(int i = 0; i < s1.length(); i++) {
            while(s1.indexOf(s1.charAt(i)) != s1.lastIndexOf(s1.charAt(i))) {
                anzahlZeichen++;
                s1 = s1.substring(0, s1.lastIndexOf(s1.charAt(i))) + (s1.substring(s1.lastIndexOf(s1.charAt(i)) + 1, s1.length()));
            }
            System.out.println(""+s1.charAt(i)+" "+anzahlZeichen+"x");
            anzahlZeichen = 1;
        }
    }    
}