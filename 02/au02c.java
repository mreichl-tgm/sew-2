/**
 * au02c
 * 
 * mreichl 
 * 13.11.14
 */

import java.util.*;
public class au02c
{
    public static void main() {
        Scanner s = new Scanner(System.in);
         
        for(int t = 0; t < 5; t++) {
            int n = (int)(Math.random()*(9 - 1) + 1);
            
            System.out.println("Bitte geben Sie einen Text ein");
            String input = s.nextLine();
            
            for(int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                
                if((c >= '0') && (c <= '9')) {   
                    if((char)(c + n) > '9') {
                        c = (char)('0' + (c + n - '9'));
                    }else{
                        c = (char)(c + n);
                    }
                }
                if((c >= 'a') && (c <= 'z')) {
                    if((char)(c + n) > 'z') {
                        c = (char)('a' + (c + n - 'z' - 1));
                    }else{
                        c = (char)(c + n);
                    }
                }
                if((c >= 'A') && (c <= 'Z')) {
                    if((char)(c + n) > 'Z') {
                        c = (char)('A' + (c + n - 'Z' - 1));
                    }else{
                        c = (char)(c + n);
                    }
                }
                System.out.print(""+c+"");
            }
            System.out.println("");
        }
    }
}
