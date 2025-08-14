//in row sum we are adding row elements
//we are fixing row and moving across columns
import java.util.*;
public class rowsum{
    public static void main(String args[]){
        int matrix[][]={{1,4,9},{11,4,3},{2,2,3}};
        int sum=0;
        for(int j=0;j<matrix[0].length;j++){
        sum=sum+matrix[2][j];
        }
        System.out.print("sum is:"+sum);

    }
}