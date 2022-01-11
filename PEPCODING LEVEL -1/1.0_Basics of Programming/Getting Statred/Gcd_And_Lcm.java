import java.util.*;

public class Gcd_And_Lcm {

  public static void main(String[] args) {
    // Here in this question we are required to calculate the gcd and lcm of two input numbers ,for gcd we are required to iterate from samller number -1 uptill 1 any number in bewtween them which divides both the number
    // is the gcd
    //For lcm we will take a variable j initalized by 1 after that we will iterate till n for each iteration a*j % b == 0 will result in the the lcm of the two number and we would print that
    
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int least = 1;
    int temp;

    if (b < a) {// a is bigger than b
      temp = a;
      a = b;
      b = temp;
    } // a is smaller than this

    // For gcd
    for (int i = a-1; i >= 1; i--) {
      if (a % i == 0 && b % i == 0) {
        System.out.println(i);
        break;
      }

    }

    // For lcm
    int j = 1;
    while (j <= Integer.MAX_VALUE) {
      if ((a * j) % b == 0) {

        least = a * j;
        System.out.println(least);
        break;

      }
      j++;

    }
    scn.close();
  }
}
