import java.io.*;
import java.util.*;

public class Longest_onsecutive_Sequence_Of_Elements {

public static void main(String[] args) throws Exception {

   Scanner scn = new Scanner(System.in);
   int n = scn.nextInt();

   int[] arr = new int[n];

   for( int i =0; i<arr.length; i++){
     arr[i] = scn.nextInt();
   }

   HashMap <Integer , Boolean> hm = new HashMap<>();

   for( int ele : arr ){
      hm.put( ele , true);
   }

   for( int ele : hm.keySet() ){
      if( hm.containsKey(ele-1)){//Lets suppose our ans is 5,6,7,8,9 so here there is no point in taking the static point as 6 thats why if 5 exist then mark 6 as false which means it cannot became tempory static point as five already exist
          hm.put(ele , false);
      }
   }

   int maxLen = 0;
   int MaxStPt = 0;

   for( int ele : hm.keySet() ){

       if( hm.get(ele) == true ){

           int tempLen = 1;
           int tempStPt = ele;;

           while( hm.containsKey(tempStPt+tempLen)){
               tempLen++;
           }

           if( tempLen> maxLen ){
               MaxStPt = ele;
               maxLen = tempLen;
           }  
       }
   }

   for( int i = MaxStPt; i<MaxStPt+maxLen;i++){
       System.out.println(i);
   }



 }

}
