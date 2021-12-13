import java.io.*;
import java.util.*;

public class Find_Element_In_An_Array {
    //Here in this question we need to find the element occurnce index so frist we will populate the array then after that we will check it for every element in the array 
    // is there or not if not present then we would return -1 or else the index of that element by saving it in an variable and breaking to return that number

  public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int[] arr = new int[n] ;

    for ( int i = 0 ; i < arr.length ; i++) {
      arr[i] = scn.nextInt();
    }
      
    int d = scn.nextInt();
    int print = -1;
    for ( int i = 0; i < arr.length ; i++) {
      if (arr[i] == d) {
        print = i;
        break ;
      }
    }
    System.out.print(print);


  }

}
