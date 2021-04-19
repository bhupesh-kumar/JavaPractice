import java.util.*;
import java.lang.*;

class a{
    public static void main(String[] args) {
       final Scanner sc = new Scanner(System.in);
       System.out.print("Count : ");
       int n = sc.nextInt();
       float sum =0;
       System.out.print("Enter values :");
       for(int i=0;i<n;i++){
        System.out.print("["+(i+1)+"] -> ");
            sum += sc.nextInt();    
       }
       float avg =(sum/n);
       System.out.print("Total :"+sum +"\n Average :"+ avg);
    }
}