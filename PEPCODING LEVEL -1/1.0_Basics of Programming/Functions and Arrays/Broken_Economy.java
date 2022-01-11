
// import java.io.*;
import java.util.*;

public class Broken_Economy {

public static void main(String[] args) throws Exception {
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int [] arr = new int[n];
    
    for( int i = 0 ; i< n ; i++){
        arr[i] = scn.nextInt();
    }
    
    int d = scn.nextInt();
    
    int li = 0;
    int hi = arr.length - 1;
    
    int ceil = 0;
    int floor = 0;
    
    while( li <= hi ){
        
        int mid = (li + hi) / 2;
        int val = arr[mid];
        
        if( val == d){
            
            ceil = mid;
            floor = mid ;
            break;
            
        }else if( val > d){
            hi = mid -1;
            ceil = mid ;
        }else{
            li = mid+ 1;
            floor = mid ;
        }
        
    }

    
    System.out.println(arr[ceil]);
    System.out.println(arr[floor]);
 
 }
 
}
