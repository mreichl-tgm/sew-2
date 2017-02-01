package other;

public class quicksort {
    private int[] numbers;
    private int number;

    private void quicksort(int low, int high) {
        int i = low, j = high;
        int average = numbers[low + (high-low)/2];

        while (i <= j) {
            while (numbers[i] < average) {
                i++;
            }

            while (numbers[j] > average) {
                j--;
            }

            if (i <= j) {
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
                i++;
                j--;
            }
        }
        
        if (low < j) quicksort(low, j);
        if (i < high) quicksort(i, high); 
    }
}
