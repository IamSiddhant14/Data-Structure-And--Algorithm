import java.util.*;

public class Prime_Factorization_Of_A_Number {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int i = 2;

        while (i <= n) {

            if (n % i == 0 && n != 1) {
                n = n / i;
                System.out.print(i + " ");
            } else {
                i++;
            }

        }

    }

}
