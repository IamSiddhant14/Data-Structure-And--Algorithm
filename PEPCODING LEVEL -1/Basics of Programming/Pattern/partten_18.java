import java.util.*;

public class partten_18 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int os = 0;
        int is = 4;// this is number of space reduces from frist line so space would be n-is that
                   // is 3 for 7
        int ist = n - 2;

        for (int i = 1; i <= n; i++) {

            // Outer space
            for (int j = 1; j <= os; j++) {
                System.out.print("\t");
            }

            // Frist star
            System.out.print("*\t");

            // inner star
            for (int k = 1; k <= ist; k++) {
                System.out.print("*\t");
            }

            // Inner space
            if (i != 1) {
                for (int l = 1; l <= n - is; l++) {
                    System.out.print("\t");
                }
            }

            // Outer star
            if (i != (n / 2) + 1) {
                System.out.print("*\t");
            }

            // Enter
            System.out.println();

            if (i <= (n / 2)) {
                os += 1;
                ist = -1;
                if (i != 1) {
                    is += 2;
                }

            } else {
                os -= 1;
                ist += 2;
            }

        }

        scn.close();
    }
}
