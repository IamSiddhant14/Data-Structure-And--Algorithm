import java.util.*;

public class Any_Base_To_Decimal {

    // Here we need to convert the input base number to decimal number there fore n to the base of b is given and we need to calculate x to the base of 10  
    // Loop we run untile the value of n dont became equal to zero and each iteration we will devide n with left b with n , after that n will became n/10  and power
    // will power = power * b , t+= r* power 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
        scn.close();
    }

    public static int getValueIndecimal(int n, int b) {
        
        int total = 0;
        int power = 1;
        while (n != 0) {
            int r = n % 10;
            n = n / 10;
            r = r * power;
            power *= b;
            total = total + r;

        }
        return total;

    }
}
