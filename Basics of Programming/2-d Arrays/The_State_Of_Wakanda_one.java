import java.io.*;
import java.util.*;


public class The_State_Of_Wakanda_one {


  public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);
    int row = scn.nextInt();
    int col = scn.nextInt();
    int[][] arr = new int[row][col];

    for ( int i = 0; i < row; i++) {
      for ( int j = 0; j < col ; j++) {
        arr[i][j] = scn.nextInt();
      }
    }

    for ( int i = 0; i < col ; i++) {


      if ( i % 2 == 0) {
        for ( int j = 0; j < row; j++) {
          System.out.print(arr[j][i]);
          System.out.println();
        }
        
      } else {
        for ( int j = row - 1; j >= 0; j--) {
          System.out.print(arr[j][i]);
          System.out.println();
        }
        
        
      }


    }
scn.close();

  }




}




