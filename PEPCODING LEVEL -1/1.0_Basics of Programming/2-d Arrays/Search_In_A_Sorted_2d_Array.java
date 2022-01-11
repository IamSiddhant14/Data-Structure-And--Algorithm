import java.io.*;
import java.util.*;


public class Search_In_A_Sorted_2d_Array {


    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
 
        int[][] arr = new int[n][n];

        for( int i =0; i<n; i++){
            for( int j =0; j<n; j++){
                arr[i][j]= scn.nextInt();
            }
        }

        int x = scn.nextInt();

        int a = -1;
        int b = -1;

        for( int i =0; i< n; i++){
            for( int j =0; j< n; j++){

                if(arr[i][j] == x){
                    a = i;
                    b = j;
                    System.out.println(a); 
                    System.out.println(b); 
                    break;
                }
            }
        }

        if( a == -1 || b == -1){
            System.out.println("Not Found"); 

        }

        
    }

}
