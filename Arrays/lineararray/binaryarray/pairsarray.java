//tc  O(n^2)
import java.util.*;
public class pairsarray{
    public static void pairs(int numbers[]){
        int tp=0;
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];

            for(int j=0;j<numbers.length;j++){
                System.out.println("("+curr+","+numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs:"+tp);
    }
    public static void main(String args[]){
        int numbers[]={1,3,5,7,9,11,13,15,17};

    pairs(numbers);
    }
}