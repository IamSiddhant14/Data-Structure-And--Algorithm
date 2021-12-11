// import java.io.*;
import java.util.*;

public class state_of_wakanda_optimized {

    public static Scanner scn = new Scanner(System.in);
    
    public static void input(int[][] arr){

        int n = arr.length ;
        for( int i =0 ; i<n ; i++){
            for( int j =0; j<n ; j++){
                arr[i][j] = scn.nextInt();
            }
        }

    }

    public static void main(String[] args) throws Exception {

        int n = scn.nextInt();

        int [][] arr = new int[n][n];
        input(arr);

        for( int k =0; k< n ; k++){
            
            for( int i = 0; i< n-k ; i++){
                    System.out.println(arr[i][k+i]);
            }
        }


    }

}


