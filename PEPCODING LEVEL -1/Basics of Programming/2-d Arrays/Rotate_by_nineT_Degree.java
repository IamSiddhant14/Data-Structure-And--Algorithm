import java.io.*;
import java.util.*;


//Here in this question in order to obtain the desired result we will frist perfome the transpose operation on the entire upper part of array after that we 
// Will be performing the col reverse opertion on the all the col and the respective rows
public class Rotate_by_nineT_Degree {


public class Main {

  public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int[][] arr = new int[n][n];

    for (int i = 0; i < n; i++) {
      for ( int j = 0; j < n; j++) {
        arr[i][j] = scn.nextInt();
      }
    }

    transpose(arr);
    swapc(arr);
    display(arr);
  }


  public static void swapc(int[][] arr) {
    for ( int i = 0; i < arr.length; i++) {
        
      int j = i;
      int l =0;
      int k = arr.length - 1;
      
      while (l < k) {
        int temp = arr[j][k];
        arr[j][k] = arr[j][l];
        arr[j][l] = temp;
        l++;
        k--;
      }

    }
  }

  public static void transpose(int[][] arr) {

    for ( int i = 0; i < arr.length; i++) {

      for ( int j = i; j < arr.length; j++) {

        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;

      }

    }
  }

  public static void display(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

}
}
