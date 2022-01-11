
import java.util.*;

public class Rotate_A_Number_optimized {

  public static void main(String[] args) {
    // write your code here

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int k = scn.nextInt();
    int temp = n;
    int count = 0;
    int p = 1;


    while (temp != 0) {
      count++;
      temp = temp / 10;
      p = p * 10;
    }

    k =  Math.abs(k) % count;

    if (k < 0) {
      
      k = k + count;
    }
    int power = 1 * (int) Math.pow(10, k);

    int r = n % power;
    n = n / power;
    r = r * (int) Math.pow(10, count - k);
    n = n + r;


    System.out.println(n);
    scn.close();
  }
}































// import java.util.*;

//   public class Main{

//   public static void main(String[] args) {
//      // write your code here
//      Scanner scn = new Scanner(System.in);
//      int n =scn.nextInt();
//      int k = scn.nextInt();
//      int temp = n;
//      int count = 0;
//      while(temp != 0){
//          temp = temp/10;
//          count++;
//      }
//      //If there is an array of size 5 and k value is 8 then effectively we would only be rotating the array by 3 times only which is the dremainder of 8%5
//      k = k % count;
//      if(k<0){
//         k=k+count;
//      }
//      while(k!= 0){
//         int r = n%10;
//         n = n/10;
//         r = r* (int) Math.pow(10, count - 1);
//         n=n+ r;
//         // count --;
//         k--;
//      }

//      System.out.println(n);

//     }
//   }

