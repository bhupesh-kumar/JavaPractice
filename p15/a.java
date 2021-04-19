import java.util.*;
import java.lang.*;

class a{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int temp = n;
        int sum =0;
        int div =0;
        while(temp>0){
            div = temp%10;
            // System.out.println("temp:" + temp);
            sum+=div;
            // System.out.println("sum:" + sum);
            temp/=10;
        }
        System.out.println("Sum of number is :" + sum);
    }
}