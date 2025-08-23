
import java.util.*;
public class sum{
    public static int calSum(int n){
        if(n==1){
            return 1;
        }
        int Snm=calSum(n-1);
        int Sn=n+Snm;
        return Sn;


    }
    public static void main(String[] args){

      int n=5;
      System.out.println(calSum(n));
    }
}