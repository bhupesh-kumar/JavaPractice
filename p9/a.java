import java.util.*;
import java.lang.*;

class a{
    public static void main(String[] args) {
        final Scanner sc= new Scanner(System.in);
        int a,b,c;
        a =10;
        b =20;
        c =30;
        if(a>b){
            System.out.println(a+"is greater");
        }else{
            System.out.println(b+"is greater");
        }

        if(a>b){
            System.out.println(a+"is greater");
        }else if(b>c){
            System.out.println(b+"is greater");
        }else{
            System.out.println(c+"is greater");
        }

        String opt = sc.nextLine();
        switch (opt) {
            case "a":
            System.out.println(a);
                break;
            case "b":
            System.out.println(b);    
                break;
            case "c":
            System.out.println(c);    
                break;        
            default:
                break;
        }
    }
}