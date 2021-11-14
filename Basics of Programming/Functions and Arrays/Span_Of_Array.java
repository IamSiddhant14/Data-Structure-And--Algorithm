// import java.io.*;
import java.util.*;

public class Span_Of_Array {
//Here in this question we are supoose to calucate the diffrence bewteen the max nad the minmum value diffence in an array to do that initalize a max varible ny min value and a 
// min integer with max value after that iterate till i = 0 and i less then arr.length in each iteration compare the corresponding value with min and max and change it accordinly
// after completion of loop return the value of max-min ;
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

        }

        for (int i = 0; i < arr.length; i++) {

            if (min > max) {
                max = min;
            }

            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println(max - min);

        scn.close();
    }
}
