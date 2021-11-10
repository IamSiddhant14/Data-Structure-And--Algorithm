import java.util.*;
   
   public class Rotate_A_Number {
   
   public static void main(String[] args) {
     // here in this question we will frist check if value of k is greather then n if yes then devide it by n and now new value 
     // would be k=k% count where count is the number of digits in n if k < 0 then k = k+n now until value ok k isnt =0 r =n%10 , n=n/10 , r=r*Math.pow(10,count -1
     // n=n+r, k-- ,when k ==0 then print k 
     Scanner scn = new Scanner(System.in);
     int n =scn.nextInt();
     int k = scn.nextInt();
     int temp = n;
     int count = 0;
     while(temp != 0){
         temp = temp/10;
         count++;
     }
     //If there is an array of size 5 and k value is 8 then effectively we would only be rotating the array by 3 times only which is the dremainder of 8%5
     k = k % count; 
     if(k<0){
        k=k+count;
     }
     while(k!= 0){
        int r = n%10;
        n = n/10;
        r = r* (int) Math.pow(10, count - 1);
        n=n+ r;
        // count --;//since we arent reducing the size of n
        k--;
     }
     
     System.out.println(n);
     scn.close();
    }
   }
   
   
