import java.util.*;

public class partten_5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        // Frist part
        // 5/2 is 2 not 2.5
        for (int i = 1; i <= (n / 2) + 1; i++) {

            // space

            for (int j = 1; j <= (n / 2) + 1 - i; j++) {
                System.out.print("\t");
            }

            // star

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*\t");
            }

            System.out.println();

        }

        // Second part

        for (int i = 1; i <= (n / 2); i++) {// row

            // space

            for (int j = 1; j <= i; j++) {// col space
                System.out.print("\t");
            }

            // star

            for (int k = 1; k <= n - 2 * i; k++) {// col star
                System.out.print("*\t");
            }

            System.out.println();

        }
    scn.close();
    }
}
