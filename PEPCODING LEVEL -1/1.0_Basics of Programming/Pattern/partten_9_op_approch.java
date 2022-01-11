import java.util.*;

public class partten_9_op_approch {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();

    int isp = n-2;
    int osp = 0;

    for ( int i = 0; i < n ; i++) {

      for ( int k = 0; k < osp; k++) {
          System.out.print("\t");
      }

      System.out.print("*\t");

      for ( int j = 0 ; j < isp; j++) {
        System.out.print("\t");
      }

      if (i != (n / 2)) {
        System.out.print("*\t");
      }


      if ( i < (n / 2)) {
        isp -= 2;
        osp++;
      } else {
        isp += 2;
        osp--;
      }
      System.out.println();

    }

  }
}