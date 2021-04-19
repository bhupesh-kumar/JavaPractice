import java.util.*;
import java.lang.*;

class a{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        char ch ;
        for(int i=0 ; i<n ;i++){
            for(int j=n; j>i; j--){
                ch ='A';
                ch+=(n-j);
                System.out.print(ch);
            }
            
            for(int k=0;k<i;k++){
                System.out.print("  ");    
            }
            
            for(int l=n-1; l>=i; l--){
                ch = 'A';
                ch+=(l-i);
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}