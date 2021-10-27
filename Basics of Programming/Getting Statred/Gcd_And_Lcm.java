import java.util.*;
public class Gcd_And_Lcm {
    
  public static void main(String[] args) {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int least = 1;
    int temp;

    if (b < a) {//a is bigger than b
      temp = a;
      a = b;
      b = temp;
    }//a is smaller than this




    //For gcd
    for (int i = a ; i >= 1; i--) {
      if ( a % i == 0 && b % i == 0) {
        System.out.println(i);
        break;
      }

    }


    //For lcm
    int j =1;
    while (j <= Integer.MAX_VALUE ) {
      if ( (a * j) % b == 0 ) {
          
        least = a*j;
        System.out.println(least);
        break;
       
      }
      j++;

    }

  }}
