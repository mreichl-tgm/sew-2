/*
 * AU02a - Typconv.
 * 
 * mreichl 
 * 6.11.14
 */

import java.util.*;
public class au02a
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Bitte geben Sie einen Text ein");
        String input = s.nextLine();
        
        for(int i = 0; i < input.length(); i++)
        {
            int dez = input.charAt(i);
            int rest = 0;
            String hex = "";
            
            do 
            {
                rest = dez/16;
                switch(rest) {
                    case 10 : hex = 'A' + hex;
                              break;
                    case 11 : hex = 'B' + hex;
                              break;
                    case 12 : hex = 'C' + hex;
                              break;
                    case 13 : hex = 'D' + hex;
                              break;
                    case 14 : hex = 'E' + hex;
                              break;
                    case 15 : hex = 'F' + hex;
                              break;
                    default : hex = rest + hex;
                }
            } while(dez > 0);
            System.out.print(""+input.charAt(i)+" ");
            System.out.print(""+dez+" ");
            System.out.println(""+hex+" ");
        }
    }
}