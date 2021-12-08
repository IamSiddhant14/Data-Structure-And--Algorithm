// import java.io.*;
import java.util.*;

public class Subsets_Of_Array {

public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] arr = new int[n];
    for( int i =0; i<n ;i++ ){
        arr[i] = scn.nextInt();
    }

    int num = (int)Math.pow(2 , n);
    for( int i =0 ; i< num; i++){

        int no = i;
        int power = 1;
        int total = 0;


        while( no!=0){
            int r = no % 2;
            no= no/2;
            total += r*power ;
            power *= 10;

        }

        int j = 0;
        while( total != 0 || j<3){

            int r = total % 10;
            if(r*arr[j] == 0){
                System.out.print("-\t");
            }else{
                System.out.print(r*arr[j]+"\t");
            }
            
            j++;
            total = total/10;

        }
        System.out.println();

    }
    


 }

}

