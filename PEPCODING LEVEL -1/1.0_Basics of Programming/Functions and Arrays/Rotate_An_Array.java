import java.io.*;
import java.util.*;

public class Rotate_An_Array {

    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void reverse(int[] a, int i, int j) {

        while (i < j) {

            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            i++;
            j--;
        }

    }

    public static void rotate(int[] a, int k) {

        int l = a.length;

        k = k % l;
        if (k < 0) {
            k = k + l;
        }

        reverse(a, 0, l - k - 1);
        reverse(a, l - k, l - 1);
        reverse(a, 0, l - 1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        rotate(a, k);
        display(a);
    }

}
