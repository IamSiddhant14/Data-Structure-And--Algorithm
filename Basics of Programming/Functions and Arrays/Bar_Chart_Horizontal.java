// import java.io.*;
import java.util.*;


//Here in this question in order to print the required bar chart we will frist calculate the largest element present in the array after that 
//we will traverse through row for max value which is present in the array and inside that for loop for each iteration of that loop we will 
//calcuate whether the arr index value which is present at that index is is greather or equal to the row number or not if found then print star or
// else we will print a space 
public class Bar_Chart_Horizontal {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            arr[i] = scn.nextInt();

            if (arr[i] > max) {
                max = arr[i];
            }
        }

      
        for (int i = max; i > 0; i--) {

            for (int k = 0; k < arr.length; k++) {

                int j = arr[k];

                if (i <= j) {

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
