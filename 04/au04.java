//Berechnet Primzahlen in einem bestimmten Bereich

public class au04 {
    public static void main() {         
        boolean[] ary = new boolean[100];
        
        for(int i = 0; i < ary.length; i++) {
            ary[i] = true;
        }
        
        for(int i = 2; i < ary.length; i++) {
            if(!ary[i]) {
                continue;
            }else{
                for(int j = 2; j < ary.length/2; j++) {
                    int vf = i * j;
                    if(vf >= ary.length) {
                        break;
                    }
                    ary[vf] = false;
                }
            }
        }
        
        for(int j = 3; j < ary.length; j++) {
            if(ary[j]) {
                System.out.println(j);
            }
        }
    }
}