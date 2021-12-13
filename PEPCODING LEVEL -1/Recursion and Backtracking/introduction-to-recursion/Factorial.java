import java.io.*;
import java.util.*;

public class Factorial {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        int n = scn.nextInt();
        System.out.println(factorial(n));


    }
    public static int factorial(int n){

        if( n == 0){
            return 1 ;
        }
        int fact = n*factorial(n-1);
        
        return fact;
    }

}
    

