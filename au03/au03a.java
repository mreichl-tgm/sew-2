import java.util.*;
public class au03a
{
    public static void main() {
        //Eingaben
        System.out.println("Bitte Arraylänge eingeben:");
        int input1 = input();
        System.out.println("Bitte eine Untergrenze eingeben:");
        int input2 = input();
        System.out.println("Bitte eine Obergrenze eingeben:");
        int input3 = input();
        
        //Randomzahl
        int random = (int)(Math.random() * 10) + input2;
        
        int[] ary = new int[input1];
        for(int i = 0; i < ary.length; i++) {
            int counter = 0;
            ary[i] = (int)(Math.random() * (input3 - input2)) + input2;
            for(int j = 1; j < 10; j++) {
                if(ary[i]%j != 0) {
                    counter++;
                }
            }
            if(counter == 9){
                System.out.println(""+ary[i]+"");
                i++;
            }else{
                i--;
            }
        }
    }
    
    public static int input() {
        Scanner s = new Scanner(System.in);
        String input1 = s.nextLine();
        int input2 = -1;
        while(input2 < 0) {
            try {
                input2 = Integer.parseInt(input1);
            } catch(Exception e) {
                System.out.println("Verwenden Sie nur ganze Zahlen:");
                input1 = s.nextLine();
            }
        }
        return input2;
    }
}