
import java.util.*;

public abstract class is_prime {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();
        int j = 1;
        while (j <= t) {
            int n = scn.nextInt();
            int flag = 0;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    flag++;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }

            j++;

        }
        scn.close();
    }
}

// import java.util.*;

// public class Main {

// public static void main(String[] args) {
// Scanner scn = new Scanner(System.in);

// // write ur code here
// int t = scn.nextInt();
// int i = 0;
// while (i < t) {
// int flag = 1;
// int n = scn.nextInt();
// for ( int j = 2; j * j <= n; j++) {
// if (n % j == 0) {
// flag = flag - 1;
// break;
// }
// }
// if (flag == 0) {
// System.out.println("not prime");
// } else {
// System.out.println("prime");
// }

// i++;
// }

// }
// }
