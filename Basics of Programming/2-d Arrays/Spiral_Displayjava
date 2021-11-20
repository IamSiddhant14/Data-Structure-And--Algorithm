import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();

    int[][] arr = new int[n][m];

    for (int i = 0; i < n; i++) {
      for ( int j = 0; j < m ; j++) {
        arr[i][j] = scn.nextInt();

      }
    }

    int k = 0;
    int total = n * m;
    int minr = 0;
    int minc= 0;
    int maxr = n-1;
    int maxc = m-1;
    while ( k < total) {
      for ( int i = minr; i <= maxr && k < total; i++) {
        System.out.println(arr[i][minc]+" ");
        k++;
      }
      minc++;

      for ( int j = minc; j <= maxc && k < total; j++) {
        System.out.println(arr[maxr][j]+" ");
        k++;
      }
      maxr--;

      for ( int i = maxr; i >= minr && k < total; i--) {
        System.out.println(arr[i][maxc]+" ");
        k++;
      }
      maxc--;

      for ( int j = maxc ; j >= minc && k < total; j--) {
        System.out.println(arr[minr][j]+" ");
        k++;
      }
      minr++;
    }

  }

}