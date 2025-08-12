//not sorted
import java.util.*;
public class bubblesort{
    public static void bubbleSort(int arr[]){
        int passes=0;
        int comparison=0;
        for(int pass=0;pass<arr.length-1;pass++){
            passes++;
            for(int j=0;j<arr.length-1-pass;j++){
                comparison++;
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("no of passes:"+passes);
        System.out.println("no of comparisons:"+comparison);

    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"");
        }
        System.out.println();
    }
  public static void main(String args[]){
    int arr[]={5,4,1,3,2};
    bubbleSort(arr);
    printArr(arr);

  }
}