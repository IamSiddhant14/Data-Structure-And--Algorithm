import java.util.*;

public class Digit_Frequency {
    //Here in this question we are suppose to calculate the digit frequecy of the provided digit so  as to accomplis this we will take a variable count initalze it with 0 and will 
    // keep on increasing its value until temp which was n initale becames equal to zero ,then after that we will return the count 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
        scn.close();
    }

    public static int getDigitFrequency(int n, int d) {

        int count = 0;
        while (n != 0) {
            int r = n % 10;
            if (r == d) {
                count++;
            }
            n = n / 10;
        }
        return count;

    }
}
