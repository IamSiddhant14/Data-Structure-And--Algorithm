import java.util.*;

public class partten_18_unoptimized {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int ospa = 1;
        int st = 0;
        int ist = -1;
        int ispa = n / 2;

        for (int i = 1; i <= n; i++) {

            if (i == 1) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*\t");
                }
            } else {

                for (int k = 1; k <= ospa; k++) {
                    System.out.print("\t");
                }

                if (i == ((n / 2))) {
                    System.out.print("*\t");
                } else {
                    System.out.print("*\t");

                    for (int m = 1; m <= ispa; m++) {
                        System.out.print("\t");
                    }

                    for (int p = 1; p <= ist; p++) {
                        System.out.print("*\t");
                    }
                    System.out.print("*\t");

                    if (i <= (n / 2) + 1 && i != 1) {
                        ospa += 1;
                        ispa -= 2;
                        ist = -1;

                    } else {
                        ist += 2;
                        ospa -= 1;
                        ispa = 0;
                    }
                }
                System.out.println();

            }

        }
    scn.close();
    }
}
