import java.util.*;

public class Any_Base_Addition {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);

        scn.close();
    }

    public static int getSum(int b, int n1, int n2) {

        int r = 0;
        int sum_all = 0;
        int result = 0;
        int power = 1;
        while (r != 0 || n1 != 0 || n2 != 0) {

            int r1 = n1 % 10;
            int r2 = n2 % 10;

            sum_all = r1 + r2 + r;

            int lastnum = sum_all % b;

            r = sum_all / b;

            result = result + (lastnum * power);

            n1 = n1 / 10;
            n2 = n2 / 10;
            power = power * 10;

        }

        return result;

    }
}
