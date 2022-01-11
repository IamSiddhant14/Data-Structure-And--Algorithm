import java.io.*;
import java.util.*;

public class Max_Min_2 {

  public static void main(String[] args) throws Exception {

      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();

      int[] arr = new int[n];

      for( int i =0; i< n; i++){
          arr[i] = scn.nextInt();
      }
 
      int min1 = Integer.MAX_VALUE ;
      int min2 = Integer.MAX_VALUE ;

      int max1 = Integer.MIN_VALUE ;
      int max2 = Integer.MIN_VALUE ;

      for( int i =0; i<n; i++){


        //MIN

          if( arr[i] < min1){

              min2 = min1;
              min1 = arr[i];

          }else{
            if( arr[i] < min2 && arr[i] > min1){
                  min2 = arr[i];
              }
          }

        //MAX

          if( arr[i] > max1){

              max2 = max1;
              max1 = arr[i];
          }else{
                if( max1  > arr[i]  && max2 < arr[i]){
                  max2 = arr[i];
              }
          }


      }

      System.out.print(max2 +" "+min2);


  }
}


    

