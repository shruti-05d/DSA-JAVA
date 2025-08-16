import java.util.*;

public class selection{
    public static void selection(String arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos].compareTo(arr[j]) > 0) {
                    minPos = j;
                }
            }
            // Swap
            String temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        String arr[] = {"Delhi", "Kolkata", "Agra", "Mumbai", "Jaipur", "Chennai"};
        selection(arr);
        printArr(arr);
    }
}
