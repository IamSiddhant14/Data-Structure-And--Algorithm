import java.util.*;

public class Any_Base_Addition {
    
    //Here in this question we are gone add two numbers having a base x such that if sum of n1 + n2 + r is greather than the provided base then the carry will the q of sum / b and the 
    // number which will bee added to the total will be sum % b * power , Here the value of power after every iteration will be p*10 

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

            int lastnum = sum_all % b;  //This order is important please keep this in mind
          
            r = sum_all / b;

            result = result + (lastnum * power);

            n1 = n1 / 10;
            n2 = n2 / 10;
            power = power * 10;

        }

        return result;

    }
}
