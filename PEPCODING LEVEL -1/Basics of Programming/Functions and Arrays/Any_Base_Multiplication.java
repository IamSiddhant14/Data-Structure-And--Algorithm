import java.util.*;

public class Any_Base_Multiplication {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
        scn.close();
    }

    public static int getProduct(int b, int n1, int n2) {

        int total = 0;
        int outpower = 1;
        int pre = 0;
        int ans = 0;

        while (n2 != 0) {

            int r = 0;
            int r2 = n2 % 10;

            int temp = n1;
            int inpower = outpower;

            while (temp != 0) {

                int r1 = temp % 10;
                int sum = r + (r1 * r2);

                if (sum > b) {
                    pre += sum % b * inpower;
                    r = sum / b;
                } else {
                    pre += sum * inpower;
                }

                temp = temp / 10;
                inpower *= 10;

            }
            n2 = n2 / 10;
            outpower = outpower * 10;
            ans = getSum(b, pre, total);

        }
        return ans;

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











//Second attempt


import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
  }
  
  
   public static int getSum(int b, int n1, int n2) {

    int r = 0 ;
    int sum = 0;
    int total = 0 ;
    int q ;
    int power = 1;

    while ( r != 0 || n1 != 0 || n2 != 0) {

      int r1 = n1 % 10 ;
      int r2 = n2 % 10 ;

      sum = r1 + r2 + r ;

    
        r = sum / b;
        q = sum % b;


      total = total + (q * power) ;
      power = power * 10 ;
      n1 = n1 / 10 ;
      n2 = n2 / 10 ;

    }

    return total ;

  }

  public static int getProduct(int b, int n1, int n2) {

    int total = 0;
    int gt = 0;
    int sum = 0;
    int sum1 = 0;
    int sum2 = 0;
    int power2 = 1;

    while (n2 != 0) {
      int rem = n2 % 10 ;
      int temp = n1 ;
      int r = 0;
      int power = 1;
      int rem2 = 0;
      while ( temp != 0 || r != 0) {

        rem2 = temp % 10;
        sum = rem2 * rem + r;
        r = 0;
        if ( sum > b) {
          r = sum / b;
          sum = sum % b;
        }
        sum1 += sum * power;
        temp /= 10 ;
        power *= 10;

      }
      sum1 = sum1 * power2;
      power2 *= 10;
      if ( n2 != 0) {
        n2 /= 10;
      };


      temp = n1 ;
      r = 0;
      power = 1;
      sum = 0;
      while ( temp != 0 || r != 0) {

        rem2 = temp % 10;
        sum = rem2 * rem + r;
        r = 0;
        if ( sum > b) {
          r = sum / b;
          sum = sum % b;
        }
        sum2 += sum * power;
        temp /= 10 ;
        power *= 10;

      }
      sum2 = sum2 * power2;
      power2 *= 10;
      if ( n2 != 0) {
        n2 /= 10;
      }
      
      total =getSum(b , sum1 ,sum2 );
      gt +=total;



    }
    
    return gt ;


  }

}