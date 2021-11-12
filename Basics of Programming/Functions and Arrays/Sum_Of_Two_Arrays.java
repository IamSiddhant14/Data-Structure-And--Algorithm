import java.io.*;
import java.util.*;

public class Sum_Of_Two_Arrays {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];

        // populating array one
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];

        // populating array two
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = scn.nextInt();
        }

        int p = (n2 - 1);
        int o = (n1 - 1);
        int sum;
        int total = 0;
        int r = 0;
        int power = 1;

        while (p >= 0) {

            int v2 = arr2[p];
            int v1;
            if (o >= 0) {
                v1 = arr1[o];
            } else {
                v1 = 0;
            }

            sum = v1 + v2 + r;
            r = 0;
            int q;

            if (sum > 9) {

                r = sum % 10;
                q = sum / 10;
                total += (r * power);
                r = q;

            } else {

                total += (sum * power);

            }

            o--;
            p--;
            power *= 10;

        }

        int d = (int) Math.pow(10, (n2 - 1));
        while (d != 0) {
            int q = total / d;
            System.out.println(q);
            total = total % d;
            d /= 10;
        }

        scn.close();

    }
}
