import java.util.*;

public class test2 {
    //Testbeispiel 1
    public static void main() {
        Scanner s = new Scanner(System.in);
        System.out.println("Bitte einen Text eingeben");
        String input = s.nextLine();
        
        int[] ary = new int[10];
        
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            switch (c) {
                case '0': ary[0]++; 
                          break;
                case '1': ary[1]++; 
                          break;
                case '2': ary[2]++; 
                          break;
                case '3': ary[3]++; 
                          break;
                case '4': ary[4]++; 
                          break;
                case '5': ary[5]++; 
                          break;
                case '6': ary[6]++; 
                          break;
                case '7': ary[7]++; 
                          break;
                case '8': ary[8]++; 
                          break;
                case '9': ary[9]++; 
                          break;
            }
        }
        
        for(int j = 0; j < 10; j++) {
            if(ary[j] != 0) {
                System.out.println(""+ary[j]+"x "+j+"");
            }
        }
    }
    //Testbeispiel 2
    public static void test() {
        for (int i = 0; i < 10; i++) {
            for ( int j = 0; j < 10; j++) {
                System.out.print(letter());
            }
            System.out.println();
        }
    }
    //Zufallszahl
    public static char letter(){
        int number =(int)(Math.random()*(101+1)+100);
        char letter = (char)number;
        return letter;
    }
}