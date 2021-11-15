
// import java.io.*;
import java.util.*;

public class Sum_Of_Two_Arrays {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        // Taking input of array1 elements
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];

        for (int i = 0; i < n1; i++) {

            arr1[i] = scn.nextInt();
        }

        // Taking input of array2 elements
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];

        for (int j = 0; j < n2; j++) {

            arr2[j] = scn.nextInt();
        }

        // Determing whic array is larger in size
        int max = Math.max(n1, n2);
        int sum = 0;
        int total = 0;
        int r = 0;
        int[] arr3 = new int[n1 > n2 ? n1 : n2];
        int length = arr3.length;

        // Running loop for maxmium number of times
        for (int k = 1; k <= max; k++) {

            int v1 = 0;
            if (k <= n1) {
                v1 = arr1[n1 - k];
            }

            int v2 = 0;
            if (k <= n2) {
                v2 = arr2[n2 - k];
            }

            sum = v1 + v2 + r;
            r = 0;
            r = sum / 10;
            sum = sum % 10;

            total = sum;
            arr3[length - k] = total;

        }

        System.out.println("---------------");
        if (r != 0) {
            System.out.print(r + " ");
        }
        for (int val : arr3) {
            System.out.print(val + " ");
        }

        scn.close();
    }

}