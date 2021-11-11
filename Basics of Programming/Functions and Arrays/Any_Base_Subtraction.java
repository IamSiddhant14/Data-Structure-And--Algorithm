import java.util.*;

public class Any_Base_Subtraction {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
        scn.close();
    }

    public static int getDifference(int b, int n1, int n2) {

        int sum_all = 0;
        int total = 0;
        int power = 1;
        int nr = 0;

        while (n2 > 0) {
            int r = 0;
            if (nr != 0) {
                r = r + nr;
                nr = 0;
            }

            int r1 = n1 % 10;
            int r2 = n2 % 10;

            sum_all = r + r2 - r1;
            if (sum_all < 0) {
                nr -= 1;
                sum_all = r + r2 - r1 + b;
            }
            total = total + (sum_all * power);
            power *= 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

        }
        return total;

    }
}
