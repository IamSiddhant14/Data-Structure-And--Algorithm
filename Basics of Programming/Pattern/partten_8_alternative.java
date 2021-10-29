import java.util.*;

public class partten_8_alternative {
    



  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();


    for ( int i = 1; i <= n; i++) {
      for ( int j = 1; j <= n; j++) {

        if (j == n-i+1) {
          System.out.print("*\t");
        } else {
          System.out.print("\t");
        }
      }
      System.out.println();
    }

    scn.close();

  }



}
