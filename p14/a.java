import java.util.*;
import java.lang.*;

class a{
    public static void main(String[] args) {
       int n = Integer.parseInt(args[0]);
       if(n%5!=0){
        System.out.println("Not Divisible by 5");
       }else{
        System.out.println("Divisible by 5");
       }   
    }
}