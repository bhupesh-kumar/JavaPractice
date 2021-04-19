import java.util.*;
import java.lang.*;

class a{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for(int i=0 ; i<n ;i++){
            for(int j=0; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}