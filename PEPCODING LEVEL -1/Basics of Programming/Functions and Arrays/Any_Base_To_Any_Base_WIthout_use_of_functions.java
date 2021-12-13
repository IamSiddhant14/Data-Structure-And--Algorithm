import java.util.*;

public class Any_Base_To_Any_Base_WIthout_use_of_functions {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();

        int temp = n;
        int total = 0;
        int r = 0;
        int power = 1;

        while (temp != 0) {

            r = temp % 10;
            total = total + r * power;
            power = power * b1;
            temp = temp / 10;

            int re = 0;
            int t2 = 0;
            int p = 1;

            while (total != 0) {

                re = total % b2;
                t2 = t2 + re * p;
                p *= 10;
                total = total / b2;

            }

            System.out.println(t2);

            scn.close();
        }
    }

}
