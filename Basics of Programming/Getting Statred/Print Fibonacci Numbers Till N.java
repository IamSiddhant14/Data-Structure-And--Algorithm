import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // write your code here
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
      
   }
  }