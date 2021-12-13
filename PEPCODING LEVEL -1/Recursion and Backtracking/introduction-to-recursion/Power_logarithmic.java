
import java.io.*;
import java.util.*;
    
public class Power_logarithmic {


    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        int x = scn.nextInt();
        int n = scn.nextInt();
     

        System.out.println(power(x,n));

    }
    

    public static int power(int x, int n){

        if( n == 0){
            return 1;
        }

        if( n % 2 == 0){

            int val = power( x , n/2) * power( x , n/2);
            return val;


        }else{

             int val = power( x , n/2) * power( x , n/2) ;
             val = x * val ;
             return val;

        }
        
    }

}
    
