
import java.util.*;
public class fibonacci{
    public static int fib(int n){
        if(n==1||n==0){
            return n;
        }
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        int fn=fnm1+fnm2;
        return fn;


                          //fnm=fib of n minus

    }

    public static void main(String args[]){
        int n=7;
        System.out.println(fib(n));

    }
}