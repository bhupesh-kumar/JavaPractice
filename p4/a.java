import java.util.*;
import java.lang.Math;
class a{
    public static void main(String[] args){
        final Scanner sc =new Scanner(System.in);
        System.out.print("Value :");
        int v = sc.nextInt();
        System.out.print("Select Square (1) or Cube (2)\n:");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                System.out.print("Square : "+v*v );
                break;
            case 2:
                System.out.print("Cube : "+v*v*v );
                break;
            default:
                break;
        }
    }

}