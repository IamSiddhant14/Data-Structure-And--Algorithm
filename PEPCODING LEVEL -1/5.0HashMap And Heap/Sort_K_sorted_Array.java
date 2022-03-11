import java.io.*;
import java.util.*;

public class Sort_K_sorted_Array {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int k = Integer.parseInt(br.readLine());
      
      PriorityQueue< Integer> pq = new PriorityQueue <>();

      for( int i =0; i<=k ; i++ ){//If k is 3 then add 4 elements to the priority queue and so on
          pq.add(arr[i]);
      }

      for( int i =k+1 ; i<arr.length ;i++){

          System.out.println(pq.remove());
          pq.add(arr[i]);

      }

      while( pq.size() != 0 ){
          System.out.println(pq.remove());
      }
   }

}
    

