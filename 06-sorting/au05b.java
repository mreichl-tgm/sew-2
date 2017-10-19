public class au05b
{
    public static void main() {
        int[] ary = new int[(int)(Math.random()*(10-1)+1)];
        for (int i = 0; i < ary.length; i++) {
            ary[i] = (int)(Math.random()*(100-1)+1);
        }
        
        int[] backup = new int[ary.length];
        for (int i = 0; i < ary.length; i++) {
            backup[i] = ary[i];
        }
        
        boolean switched;
        do {
            switched = false;
            for (int i = 0; i < ary.length - 1; i++) {
                if (ary[i] > ary[i + 1]) {
                    ary[i] = ary[i + 1];
                    ary[i + 1] = backup[i];
                    backup[i] = ary[i];
                    backup[i + 1] = ary[i + 1];
                    
                    switched = true;
                }
            }
        } while (switched);
        
        for (int i = 0; i < ary.length; i++) {
            System.out.println(""+ary[i]+"");
        }
    }
}
