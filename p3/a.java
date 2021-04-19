import java.util.*;
import java.lang.*;

class a{
    public static void main(String[] args) {
        final Scanner sc =new Scanner(System.in);
        System.out.print("P:");
        int p= sc.nextInt();
        System.out.print("R:");
        int r= sc.nextInt();
        System.out.print("T:");
        int t= sc.nextInt();
        System.out.print("Simple Interest: " + (p*r*t)/100);
    }
}