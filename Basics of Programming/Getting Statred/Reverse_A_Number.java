import java.util.*;

public class Reverse_A_Number {

  public static void main(String[] args) {
    // Here in this question we will devide n by 10 save it in a varible and then print that variable
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    while( n != 0){
        int q=n%10;
        n=n/10;
        System.out.println(q);
    }




    scn.close();
  }
}
