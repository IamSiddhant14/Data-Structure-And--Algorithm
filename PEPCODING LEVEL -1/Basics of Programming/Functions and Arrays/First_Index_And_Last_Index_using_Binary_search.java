import java.io.*;
import java.util.*;


public class First_Index_And_Last_Index_using_Binary_search {
public static void main(String[] args) throws Exception {
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int[] arr = new int[n];
    
    for( int i =0; i<n ; i++){
        arr[i] = scn.nextInt();
    }
    
    int d = scn.nextInt();
    
    int li = 0;
    int hi = arr.length - 1;
    
    int index = -1;
    
    
    while( li <= hi ){
        
        int mid = (li + hi) / 2;
        int val = arr[mid];
        
        if( val == d ){
            
            index = mid;
            break;
 
        }else if( val > d){
            
            hi = mid -1;
            
        }else{
            
            li = mid+ 1;
            
        }
    }
    
    //FOR LI
    
    int l = index;
    while( arr[l] == d ){
        l--;
    }
    
    l++;
    
    //FOR HI
    
    int h = index;
    while( arr[h] == d ){
        h++;
    }
    
    h--;

    System.out.println(l);
    System.out.println(h);
    
 }

}
