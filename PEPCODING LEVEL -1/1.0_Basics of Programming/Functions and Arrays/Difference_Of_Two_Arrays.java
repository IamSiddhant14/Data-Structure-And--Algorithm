import java.io.*;
import java.util.*;

public class Difference_Of_Two_Arrays {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scn.nextInt();
        }

        int[] arr3 = new int[n2];

        int sum = 0;
        int r = 0;
        for (int k = 1; k <= arr2.length; k++) {

            int v1 = 0;
            if (k <= n1) {
                v1 = arr1[n1 - k];
            }

            int v2 = 0;
            if (k <= n2) {
                v2 = arr2[n2 - k];
            }

            sum = v2 - v1 + r;
            r = 0;

            if (sum < 0) {
                r--;
                sum = sum + 10;
            }

            if (sum >= 10) {
                r = sum / 10;
                sum = sum % 10;
            }

            arr3[n2 - k] = sum;

        }

        int i = 0;
        for (int val : arr3) {
            if (i == 0 && val == 0) {

            } else {
                System.out.println(val);
            }
            i++;

        }
    scn.close();
    }

}
