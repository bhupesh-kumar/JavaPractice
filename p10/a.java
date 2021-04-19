import java.util.*;
import java.lang.*;

class a{
    public static void main(String[] args) {
        final Scanner sc =new Scanner(System.in);
        System.out.print("Boolean Value for A :");
        boolean a =sc.nextBoolean();
        System.out.print("Boolean Value for B :");
        boolean b =sc.nextBoolean();
        boolean result;
        result = a&&b;
        System.out.println("A AND B : "+ result);
         result = a||b;
        System.out.println("A OR B : "+result);
         result = !a;
        System.out.println("NOT A : "+result);
         result = !b;
        System.out.println("NOT B : "+result);
    }
}