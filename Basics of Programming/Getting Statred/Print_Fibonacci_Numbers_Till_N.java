import java.util.*;
  
  public class Print_Fibonacci_Numbers_Till_N {
  
  public static void main(String[] args) {
      // Frist print a now calculate c ,assign value of c to b and value of b to a and yeah thats pretty much it
      Scanner scn = new Scanner(System.in);
      int a = 0;
      int b = 1;
      int n = scn.nextInt();
      for(int i = 1; i<=n ; i++){
          
          int c= a+b;
          System.out.println(a);
          a=b;
          b=c;
          
      }
      scn.close(); 
   }
  }
