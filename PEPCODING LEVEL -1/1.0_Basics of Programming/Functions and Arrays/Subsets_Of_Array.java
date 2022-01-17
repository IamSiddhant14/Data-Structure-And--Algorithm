import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int[] arr = new int[n];

    for( int i=0; i<n; i++){
        arr[i] = scn.nextInt();
    }

    int power = (int)Math.pow( 2 , n);

    for( int i=0; i< power; i++){

        int val = decToBinary(i);
        int j = (int)(Math.pow(10 , n-1));
        
        for(int k = 0 ; k<n; k++){

            int ans = val / j;

            if( ans == 0){
                System.out.print("-"+"\t");
            }else{
                System.out.print(ans*arr[k]+"\t");
            }
          
            val %= j;
            j  /= 10;
            
            
        }

        System.out.println();
    }
 }

 public static int decToBinary( int n){

     int total = 0, power = 1;

     while( n != 0 ){

         int c = n % 2;
         total += c*power;

         n /= 2;
         power *= 10;

     }

     return total;
 }

}