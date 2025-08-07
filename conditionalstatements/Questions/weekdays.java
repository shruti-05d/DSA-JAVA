
//Write a Java program to input weeknumber(1-7) and 
// print day of week name using switch case


import java.util.*;
public class weekdays{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter week number(1-7)");
      int week=sc.nextInt();
      switch(week){
        case 1:
            System.out.println("MONDAY");
            break;
        case 2:
            System.out.println("TUESDAY");
            break;
        case 3:
            System.out.println("WEDNESDAY");
            break;
        case 4:
            System.out.println("THURSDAY");
            break;
        case 5:
            System.out.println("FRIDAY");
            break;
        case 6:
            System.out.println("SATURDAY");
            break;
        case 7:
            System.out.println("SUNDAY");
            break;            
        default:
            System.out.println("enter appropriate number");    
      }
    }
}