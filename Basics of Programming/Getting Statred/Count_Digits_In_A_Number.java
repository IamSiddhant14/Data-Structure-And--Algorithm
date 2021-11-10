import java.util.*;
  
  public class Count_Digits_In_A_Number{
  
  public static void main(String[] args) {
    // we will take the value of number as input now assign it to a variable lets say n in this case now create 
    // create a variable count and assign it the value as 1 now run a while lopp until the value of n became zero 
    // in each iteration of while loop n=n/10 and count ++
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
