import java.io.*;
import java.util.*;

public class Get_Common_Elements_one {


public static void main(String[] args) throws Exception {
    
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();

    int [] a1 = new int [n1];

    for( int i =0; i<n1 ; i++){
       a1[i] = scn.nextInt();
    }

    int n2 = scn.nextInt();
    int [] a2 = new int [n2];

    for( int i =0; i<n2 ; i++){
        a2[i] = scn.nextInt();
    }

    HashMap <Integer , Integer> hm = new HashMap<>();
    
    for( int i =0; i<a1.length ; i++){

        int val = a1[i];
        hm.put( val , hm.getOrDefault(val , 0)+1);

    }

    for( int i =0; i<a2.length ; i++ ){
        
        int val = a2[i];

        if( hm.containsKey(val) ){

            System.out.println(val);
            hm.remove(val);

        }
    }

    
    


 }

}
    
