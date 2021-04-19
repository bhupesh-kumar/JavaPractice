import java.util.*;
import java.lang.*;

class a{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        int div =0;
        int temp=n;
        while(temp > 0){
            div = temp%10;
            sum += div*div*div;
            temp/=10;
        }
        if(sum == n)
            System.out.println("Armstrong Number");
        else
        System.out.println("Not an Armstrong Number");
    }
}
