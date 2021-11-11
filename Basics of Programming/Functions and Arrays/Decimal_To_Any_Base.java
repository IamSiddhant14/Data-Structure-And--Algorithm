import java.util.*;

public class Decimal_To_Any_Base {
    
    // In this question we are required to convert a number in to the power of provided number so please refferthe vedio to find the short trick to it

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
        scn.close();
    }

    public static int getValueInBase(int n, int b) {

        int total = 0;
        int power = 1;

        while (n != 0) {

            int r = n % b;
            r = r * power;
            total += r;
            power = power * 10;
            n = n / b;

        }
        return total;

    }

}
