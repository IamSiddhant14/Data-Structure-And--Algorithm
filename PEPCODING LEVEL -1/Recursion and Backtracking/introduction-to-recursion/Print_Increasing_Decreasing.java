





// import java.io.*;
// import java.util.*;

// public class Print_Increasing_Decreasing {

//     public static Scanner scn = new Scanner(System.in);

//     public static void main(String[] args) throws Exception {
        
//         int n = scn.nextInt();
//         pdi(n);
//     }

//     public static void inc (int n){

//         if( n == 0){
//             return;
//         }
 
//         // int m = n-1;
//         inc( n-1);

//         System.out.println(n);

//     }

//     public static void dec (int n){

//         if( n == 0){
//             return ;
//         }

//         System.out.println(n);
//         dec(--n);

//     }


//     public static void pdi(int n){

//         int m = n;

//         dec(n);
//         inc(m);



        
//     }

// }


import java.io.*;
import java.util.*;

public class Main {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        int n = scn.nextInt();
        pdi(n);

    }

    public static void pdi(int n){

        if ( n == 0){
            return ;
        }

        System.out.println(n);

        pdi(n -1);

        System.out.println(n);
        
    }

}









// public static void pdi(int n){
//         if(n == 0)
//             return;
//         System.out.println(n); // postder dec
//         pdi(n-1);
//         System.out.println(n);
        
//     }
    

