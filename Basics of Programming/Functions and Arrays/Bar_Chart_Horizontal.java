// import java.io.*;
import java.util.*;

public class Bar_Chart_Horizontal {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            arr[i] = scn.nextInt();

            if (arr[i] > max) {
                max = arr[i];
            }
        }

      
        for (int i = max; i > 0; i--) {

            for (int k = 0; k < arr.length; k++) {

                int j = arr[k];

                if (i <= j) {

                    System.out.print("*\t");

                } else {

                    System.out.print("\t");

                }

            }
            System.out.println();
        }

        scn.close();

    }
}
