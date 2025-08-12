import java.util.*;

public class Abubblesort {
    public static void Abubblesort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) { // descending order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        Abubblesort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
