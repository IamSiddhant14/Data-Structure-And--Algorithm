import java.util.*;

public class Any_Base_To_Any_Base {
    // TO convert any base to any base we need to follow a specific method but
    // Instead of remenbering all of that we frist conver the b1 base to 10 base and
    // Then that converted base 10 to b2 base so as to avid any remembring of stuff
    // Here in this we will create three fuction of which one has the duty to multiply a number with an provided integer
    // Second function will help us in adding digits
    // Third function calls the other two functions
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();


        int ans = getValue(n, sourceBase, destBase);
        System.out.println(ans);
        scn.close();

    }

    public static int getValue(int n, int sourceBase, int destBase) {
        int sourcetoten = sourceToDecimal(n, sourceBase);
        int tentodes = decimalToDest(sourcetoten, destBase);
        return tentodes;
    }

    public static int sourceToDecimal(int n, int b) {

        int total = 0;
        int power = 1;

        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            r = r * power;
            power = power * b;
            total += r;
        }

        return total;
    }

    public static int decimalToDest(int n, int b) {

        int total = 0;
        int power = 1;

        while (n > 0) {
            int r = n % b;
            n = n / b;
            r = r * power;
            power = power * 10;
            total += r;
        }

        return total;
    }

}
