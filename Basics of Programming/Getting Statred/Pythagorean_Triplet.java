import java.util.*;

public class Pythagorean_Triplet {

  public static void main(String[] args) {
    // write your code here

    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int c = scn.nextInt();
    int temp = 0;
    int largest ;
    //Determining which is largest amoung a and b
    if ( a > b) {
      largest = a;
    } else {
      largest = b;
    }
    //Determinig which is largest bewteen c and largest
    if ( c > largest) {
      largest = c;
    }

    if (largest == c) {
      System.out.println((c * c) == (a * a) + (b * b));
    } else if ( largest == b) {
      System.out.println((b * b) == (a * a) + (c * c));
    } else {
      System.out.println((a * a) == (b * b) + (c * c));
    }
    scn.close();
  }
}