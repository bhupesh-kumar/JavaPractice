import java.util.*;
import java.lang.Math;
class a{
    public static void main(String[] args){
        final Scanner sc =new Scanner(System.in);
        System.out.print("Select Circle (1) or Triangle (2)\n:");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                System.out.print("radius:");
                int r= sc.nextInt();
                System.out.print("Area of Circle : "+ Math.PI*r*r );
                break;
            case 2:
                System.out.print("height:");
                int h= sc.nextInt();
                System.out.print("base:");
                int b= sc.nextInt();
                System.out.print("Ara of triangle : "+0.5*h*b );
                break;
            default:
                break;
        }
    }

}