import java.io.*;
import java.util.*;

public class maxOfArray_third_approch {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for( int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        System.out.println(maxOfArray(arr,0));

        scn.close();
    }

    public static int maxOfArray(int[] arr, int idx){

        // One line Approch :-

        return (idx == arr.length - 1) ? arr[idx] : Math.max( arr[idx] : maxOfArray(arr, idx + 1 ));
        
        
    }




    
}
