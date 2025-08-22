
import java.util.*;
public class largeststring{


public static void main(String args[]){
    String fruits[]={"apple","banana","pineapple"};
    String largest=fruits[0];  //assuming the first one to be the largest
    for(int i=0;i<fruits.length;i++){
        if(largest.compareTo(fruits[i])<0){
            largest=fruits[i];
        }
    }
    System.out.println(largest);
}
}