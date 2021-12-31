import java.io.*;
import java.util.*;

public class Display_Array {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for( int i =0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        displayArr(arr , arr.length-1);


    }

    public static void displayArr(int[] arr ,int idx){

        if( idx == -1){
            return ;
        }
        // Since here we will be provided with the last index value of the array and we need to print it from frist to the last index therefore frist we will make a recursive call until base case is arived after that we will print our part that is printing the last index element 
        displayArr(arr , idx -1);
        System.out.println(arr[idx]);


    }

}
