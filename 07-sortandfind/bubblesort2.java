public class bubblesort2
{
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
                
                if (ary[i] < ary[i + 1]) {
                    ary[i + 1] = ary[i];
                    ary[i] = backup[i + 1];
                    backup[i + 1] = ary[i + 1];
                    switched = true;
                }
            }
        } while (switched);
        return ary;
}
