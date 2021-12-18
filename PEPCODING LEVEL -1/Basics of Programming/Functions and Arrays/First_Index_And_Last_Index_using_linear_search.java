import java.io.*;
import java.util.*;

public class First_Index_And_Last_Index_using_linear_search {
public static void main(String[] args) throws Exception {
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int[] arr = new int[n];
    
    for( int i =0; i<n ; i++){
        arr[i] = scn.nextInt();
    }
    
    int d = scn.nextInt();
    
    int li = -1;
    int hi = li;
    
    for( int i = 0; i< n ; i++){
        
        if( arr[i] == d ){
            if( li == -1){
                li = i;
            }
            hi = i;
        }
    }
    
    System.out.println(li);
    System.out.println(hi);
    
 }

}
