
import java.util.*;

public class sortedbubble {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        int comparisons = 0;
        int passes = 0;

        for (int pass = 0; pass < n - 1; pass++) {
            boolean swapped = false;
            passes++;

            for (int j = 0; j < n - 1 - pass; j++) {
                comparisons++;
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps happened → array is already sorted
            if (!swapped) {
                break;
            }
        }

        // Output sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Passes: " + passes);
        System.out.println("Comparisons: " + comparisons);
    }

    public static void main(String[] args) {
        int arr[] = {5,3,4,2,1}; // already sorted
        bubbleSort(arr);
    }
}
