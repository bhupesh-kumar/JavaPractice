import java.util.*;
import java.lang.*;

class a{
    public static void main(String[] args) {
        System.out.println("Equation : ((a*x^2)+(b*x)+c)");
        double a=1;
        double b=5;
        double c=6;

        double x=((-b+Math.sqrt((b*b)-4*a*c))/2*a);
        double y=((-b-Math.sqrt((b*b)-4*a*c))/2*a);
        System.out.println("X -> :"+x);
        System.out.println("Y -> :"+y);
    }
}