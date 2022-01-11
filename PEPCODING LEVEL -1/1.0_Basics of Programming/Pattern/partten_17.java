import java.util.*;

public class partten_17 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int os = n / 2;
        int st = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= os; j++) {

                if (i == (n / 2) + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }

            }

            for (int k = 1; k <= st; k++) {
                System.out.print("*\t");
            }

            System.out.println();

            if (i <= n / 2) {
                st += 1;
            } else {
                st -= 1;
            }

        }

        scn.close();

    }
}
