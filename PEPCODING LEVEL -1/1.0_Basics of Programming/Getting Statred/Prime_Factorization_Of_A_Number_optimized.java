
import java.util.*;

public class Prime_Factorization_Of_A_Number_optimized {
public static void main(String[] args) {

  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  int temp = n;

  int i = 2;
  while( i*i <= temp){

      if( n % i == 0){

          n = n / i;
          System.out.print(i+" ");

      }else{
          i++;
      }

  }

  if( n != 1){
      System.out.print(n);
  }
  
 }
}






// //Approch _2
// import java.util.*;

// public class Main{

// public static void main(String[] args) {
//   Scanner scn = new Scanner(System.in);
//   int n = scn.nextInt();

//   for(int i =2; i* i <= n; i++){

//       while( n % i == 0){
//           n = n / i;
//           System.out.print(i+" ");
//       }
//   }

//   if( n != 1){
//       System.out.print(n);
//   }
//  }
// }


