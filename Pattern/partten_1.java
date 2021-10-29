import java.util.*;

public class partten_1 {

  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    for ( int i = 1; i <= n ; i++) {

      for (int j = 1; j <= i; j++) {
          //\t means tab
        System.out.print("*\t");
      }

      System.out.println();
    }



  }
}