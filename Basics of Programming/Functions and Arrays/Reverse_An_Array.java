import java.io.*;
import java.util.*;

public class Reverse_An_Array {

    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void reverse(int[] a) {

        int temp;
        int l = a.length;

        for (int i = 1; i <= (a.length / 2); i++) {

            // temp = a[i - 1];
            // a[i - 1] = a[l - i];
            // a[l - i] = temp ;

            temp = a[l - i];
            a[l - i] = a[i - 1];
            a[i - 1] = temp;

        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        reverse(a);
        display(a);
    }

}
