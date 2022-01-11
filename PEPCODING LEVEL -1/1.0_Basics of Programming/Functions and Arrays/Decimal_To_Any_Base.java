import java.util.*;

public class Decimal_To_Any_Base {
    
    // In this question we are required to convert a number which is of the base of ten to the power of provided number so in order to acccompish it we will frist run the loop until the 
    // the value of n dont became equal to zero after that and each iteration we will frist take the last digit multiply it to the 10 (as decimal here) and add it to the to total which h
    // here was been initalized to o , After each iteration we will increase the value of power by * 10 ;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
         // Here this b is destination base
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
