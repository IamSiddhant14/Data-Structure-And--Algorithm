import java.util.*;

public class Inverse_Of_A_Number {

public static void main(String[] args) {
  // write your code here 
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  
  int op =1;
  int od;
  int rp;
  int rd;
  int count = 0;
   
   while( n != 0){
     
       od = n%10;
       rp = od;
       rd = op *(int)Math.pow(10, od - 1);
       count = count +rd;
       n=n/10;
       op++;
   }
   
   System.out.println(count);
  scn.close();
 }
}