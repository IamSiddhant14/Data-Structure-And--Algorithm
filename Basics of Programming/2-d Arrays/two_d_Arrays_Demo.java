import java.io.*;
import java.util.*;

public class two_d_Arrays_Demo {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int product = n1 * n2;
        int[][] arr = new int[n1][n2];
        for (int i = 0; i < n1; i++) {

            for (int j = 0; j < n2; j++) {

                arr[i][j] = scn.nextInt();
                System.out.print(arr[i][j] + " ");

            }

            System.out.println();

        }

    }
}
