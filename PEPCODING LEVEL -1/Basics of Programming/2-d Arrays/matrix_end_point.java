import java.io.*;
import java.util.*;

public class matrix_end_point {

    //Here in this question we will change the direction if and only if 1 is been encountred as an element and also the right is considered as 0 down as 1 left as 2 up as 3
    //And also we will calculate the direction by the formula dir =0
    //dir = dir + arr[i]+arr[j] if sir comes out to be 0 then right 1 then down 2 left up for dir value as 4 
    //If the condition i < n && i>=0 && j < m && j >= 0 is  break then it condition becames false and now the code is on the if else condition
     public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int i = 0;
        int j = 0;
        int dir = 0;
        // Right - 0, Down - 1 , left - 2 , up - 4
        while (i < n && i>=0 && j < m && j >= 0) {
            dir = (dir + arr[i][j]) % 4;
            if (dir == 0) {
                j++;
            } else if (dir == 1) {
                i++;
            } else if (dir == 2) {
                j--;
            } else if (dir == 3) {
                i--;
            }
        }

            if (i < 0) {
                i++;
                break;

            } else if (j < 0) {
                j++;
                break;

            } else if (i == n) {
                i--;
                break;

            } else if (j == n) {
                j--;
                break;

            }
       

        System.out.println(i);
        System.out.println(j);
        scn.close();
    }
    
}
