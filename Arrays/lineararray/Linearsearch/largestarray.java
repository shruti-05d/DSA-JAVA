
import java.util.*;
public class largestarray{
    public static int getLargest(int numbers[]){      //function
     int largest=Integer.MIN_VALUE;    //-INFINITY

for(int i=0;i<numbers.length;i++){
    if(largest<numbers[i]){
        largest=numbers[i];
    }
}
return largest;
    }
    public static void main(String args[]){
        int number[]={1,2,3,4,5,6};
        int largest = getLargest(number);
        System.out.println("Largest number is: " + largest);



    }
}