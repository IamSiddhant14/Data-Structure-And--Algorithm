import java.io.*;
import java.util.*;

public class All_Indices_Of_Array {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {

        ArrayList <Integer> al = new ArrayList<> ();

        for( int i = 0; i< arr.length ; i++){

            if( arr[i] == x){

                al.add(i);

            }
        }


       int [] a = new int[al.size()];
       int i =0;
       for( int ele : al ){

            a[i] = ele;
            i++;

        }

        return a;





}


    
}
