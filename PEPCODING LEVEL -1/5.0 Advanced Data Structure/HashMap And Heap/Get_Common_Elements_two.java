import java.io.*;
import java.util.*;

public class Get_Common_Elements_two {

public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);

    int n1 = scn.nextInt();
    int[] a1 = new int [n1];

    for( int i =0; i<a1.length ; i++ ){
        a1[i] = scn.nextInt();
    }

    int n2 = scn.nextInt();
    int [] a2 = new int[n2];

    for( int i =0; i<a2.length ; i++ ){
        a2[i] = scn.nextInt();
    }

    HashMap <Integer , Integer> hm = new HashMap<>();

    for( int ele : a1 ){
        hm.put(ele , hm.getOrDefault(ele , 0)+1);
    }


    for( int i =0; i<a2.length; i++){
          
          int ch = a2[i];
          
          if( hm.containsKey(ch) && hm.get(ch) > 0){

            System.out.println(ch);
            hm.put(ch , hm.get(ch)-1 );

          }
               
    }


 }

}
    

