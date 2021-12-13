import java.io.*;
import java.util.*;

public class Power_linear {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        
        int n = scn.nextInt();
        int x = scn.nextInt();

        System.out.println(power(x,n));

    }
    

    public static int power(int x, int n){

        if( x == 0){
            return 1;
        }

        int val = n * power(--x , n);
        return val;
    }

}
    

