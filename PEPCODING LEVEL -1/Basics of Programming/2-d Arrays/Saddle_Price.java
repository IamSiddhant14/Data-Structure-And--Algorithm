import java.io.*;
import java.util.*;

public class Saddle_Price {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
 
        int[][] arr = new int[n][n];

        for( int i =0; i<n; i++){
            for( int j =0; j<n; j++){
                arr[i][j]= scn.nextInt();
            }
        }

        for( int i=0; i<n;i++){

            int min = Integer.MAX_VALUE ;
            int index = -1;

            //Finding minimum element of a row
            for( int j =0; j<n; j++){

                if( arr[i][j] < min ){
                    min = arr[i][j];
                    index = j;
                }
            }
             

            int max = min;
            int val = -1;
            for( int k =0; k<n; k++){

                if( k == i){

                }else {

                    if(max < arr[k][index]){
                        val -= 1;
                        break;
                    }

                }
            }

            if( val == -1){
                System.out.print(max);
                break;
            }

            if( i == 4){
                System.out.print("Invalid input");
            }

        }

    }

}
    

