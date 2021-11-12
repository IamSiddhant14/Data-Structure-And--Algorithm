import java.io.*;
import java.util.*;

public class Span_Of_Array {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

        }

        for (int i = 0; i < arr.length; i++) {

            if (min > max) {
                max = min;
            }

            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println(max - min);

        scn.close();
    }
}
