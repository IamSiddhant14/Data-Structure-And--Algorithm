import java.util.*;

public class partten_16 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {

            int count = 1;

            for (int j = 1; j <= i; j++) {

                System.out.print(count + "\t");
                count++;

            }

            for (int k = i + 1; k <= 2 * n - 1 - i; k++) {
                System.out.print("\t");
            }

            int ocount = i;
            for (int l = 1; l <= i; l++) {
                if (ocount == n && l == 1) {
                    ocount--;
                } else {
                    System.out.print(ocount + "\t");
                    ocount--;
                }

            }

            System.out.println();
        }

        scn.close();

    }

}
