import java.util.*;

public class partten_6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int space = 1;
        int star = n + 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= star / 2; j++) {
                System.out.print("*\t");
            }
            for (int k = 1; k <= space; k++) {
                System.out.print("\t");
            }
            for (int l = 1; l <= star / 2; l++) {
                System.out.print("*\t");
            }

            if (i <= n / 2) {
                star -= 2;
                space += 2;
            } else {
                star += 2;
                space -= 2;
            }

            System.out.println();
        }
    scn.close();
    }
}
