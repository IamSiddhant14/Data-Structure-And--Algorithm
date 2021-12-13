import java.io.*;
import java.util.*;

public class Bar_Chart_vertical {

  public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt() ;
    int[] arr = new int[n] ;
    int max = Integer.MIN_VALUE ;

    for ( int i = 0; i < arr.length ; i++) {

      arr[i] = scn.nextInt();

      if ( arr[i] > max ) {
        max = arr[i];
      }
    }

    for ( int i = 0 ; i < arr.length ; i++) {

      int j = arr[i];
      int k = 1;

      while ( k <= (max - j)) {
        System.out.println("\t");
        k++;
      }

      int l = 1;

      while ( l <= j ) {
        System.out.println("*\t");
        l++ ;
      }

    }

scn.close();

}
}
