import java.util.*;

public class Gcd_and_Lcm_optimizegd {

    public static void main(String[] args) {
        //

        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();

        // Code can work without this as well
        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        // For GCD

        int ta = a;
        int tb = b;
        int r;
        while (tb % ta != 0) {
            r = tb % ta;
            tb = ta;
            ta = r;

        }

        System.out.println(ta);

        // For LCM
        int lcm = a * b / ta;
        System.out.println(lcm);

        scn.close();
    }
}
