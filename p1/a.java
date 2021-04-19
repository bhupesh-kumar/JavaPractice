import java.util.*;
class a{
   
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("Value 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Value 2 : ");
        int num2 = sc.nextInt();
        int result = 0;
        System.out.print("Options :Add ->1 | Sub ->2 | Mul -> 3 | Div -> 4 :");
        int opt = sc.nextInt();
        switch(opt){
            case 1 :
                result = num1+num2;
                break;
            case 2 :
                result = num1-num2;
                break;
            case 3 :
                result = num1*num2;
                break;
            case 4 :
                result = num1/num2;
                break;
            default:
                break;        
        }        
        System.out.println(result);
    }
}