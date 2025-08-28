
import java.util.*;
public class arraycheck{
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
             return false;
        }
        return isSorted(arr,i+1);
    }
    
    public static void main(String[] args){
        int arr[]={9,2,5,4};
        System.out.println(isSorted(arr,0));

    }
}