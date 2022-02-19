import java.util.*;
import java.lang.*;
import java.io.*;

public class K_Largest_Elements {

        public static void main(String[] args) throws IOException {

            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] num = new int[n];
            for (int i = 0; i < n; i++) {
                num[i] = scn.nextInt();
            }
            int k = scn.nextInt();
            solve(n, num, k);

        }
        // -----------------------------------------------------
        // This is a functional problem. Only this function has to be written.
        // This function takes as input an array,n length of array and k.
        // It should print required output.

        public static void solve(int n, int[] arr, int k) {

            PriorityQueue<Integer> pq = new PriorityQueue<>();
            int a = 0;

            for (int ele : arr) {

                if (a < k) {

                    pq.add(ele);
                    a++;

                } else {

                    int val = pq.peek();
                    if (ele > val) {

                        pq.remove();
                        pq.add(ele);

                    }
                }

            }

            while (pq.size() != 0) {

                System.out.print(pq.peek());
                pq.remove();

            }

        }
    }

