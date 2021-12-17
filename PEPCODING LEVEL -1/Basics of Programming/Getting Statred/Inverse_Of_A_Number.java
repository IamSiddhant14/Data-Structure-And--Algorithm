import java.util.*;

public class Inverse_Of_A_Number {

public static void main(String[] args) {
    // Here in this question make 4 variable as original digit , original postion initalized as 1 , reversed digit and reversed position
    // Now until input digit dont became equal to 0 continue
    // od = n%10 , op = 1 , rp = MAth.pow( 10 , rd-1) rd = op * rp  now after that create a variable as digit initalized as zero add rd to this 
    // at last inc the value of op +=1
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  
  int op =1;
  int od;
  int rp;
  int rd;
  int count = 0;
   
   while( n != 0){
     
       od = n%10;
       rp = (int)Math.pow(10, od - 1);
       rd = op *rp;
       count = count +rd;
       n=n/10;
       op++;
   }
   
   System.out.println(count);
  scn.close();
 }
}
