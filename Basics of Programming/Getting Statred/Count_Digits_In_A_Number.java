import java.util.*;
  
  public class Count_Digits_In_A_Number{
  
  public static void main(String[] args) {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    // int temp = n;
    int count =0;
    while(n>0){
        n=n/10;
        count++;
    };
    
    System.out.println(count);
    
    scn.close();
   }
  }