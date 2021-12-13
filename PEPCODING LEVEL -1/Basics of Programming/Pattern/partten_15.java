import java.util.*;

public class partten_15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int os = n / 2;
        int st = 1;
        int oval = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= os; j++) {
                System.out.print("\t");
            }
            int val = oval;

            for (int k = 1; k <= st; k++) {
                System.out.print(val + "\t");
                if (k <= ((st / 2))) {
                    val += 1;
                } else {
                    val -= 1;
                }

            }

            System.out.println();

            if (i <= n / 2) {
                os -= 1;
                st += 2;
                oval++;
            } else {
                os += 1;
                st -= 2;
                oval--;
            }
        }

    }

}
