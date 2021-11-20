import java.io.*;
import java.util.*;

public class The_State_Of_Wakanda_two {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                for (int k = i; k < n; k++) {
                    if (k - j == i) {
                        System.out.println(arr[j][k]);
                    }
                }
            }
        }
        scn.close();

    }
}
