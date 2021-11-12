import java.io.*;
import java.util.*;

public class Find_Element_In_An_Array {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        int d = scn.nextInt();

        // for( int i = 0; i < arr.length ; i++ ){
        // arr[i] = scn.nextInt();
        // }

        for (int i = 0; i < arr.length; i++) {

            arr[i] = scn.nextInt();

            if (arr[i] == d) {
                System.out.print(i);
                break;
            }

            if (i == (n - 1)) {
                System.out.print(-1);
                break;
            }
        }

        scn.close();
    }

}
