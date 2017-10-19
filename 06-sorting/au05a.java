public class au05a
{
    public static void main() {
        int[] lost = { 23, 42, 4, 8, 15, 16 };
        
        int[] backup = { 23, 42, 4, 8, 15, 16 };
        
        boolean switched;
        do {
            switched = false;
            for (int i = 0; i < lost.length - 1; i++) {
                if (lost[i] > lost[i + 1]) {
                    lost[i] = lost[i + 1];
                    lost[i + 1] = backup[i];
                    backup[i] = lost[i];
                    backup[i + 1] = lost[i + 1];
                    
                    switched = true;
                }
            }
        } while (switched);
        
        for (int i = 0; i < lost.length; i++) {
            System.out.println(""+lost[i]+"");
        }
    }
}
