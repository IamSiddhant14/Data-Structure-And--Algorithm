import java.io.*;
import java.util.*;

public class Print_Increasing {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // write your code here
        int n = scn.nextInt();
        printIncreasing(n);

    }

    public static void printIncreasing(int n){

        if( n == 0){
            return;//Here this is returning to the n = 1 function and the n= 0 function is been removed from the stack
        }
        int m = n-1;
        printIncreasing(m);
        System.out.println(n);

        
    }

}

