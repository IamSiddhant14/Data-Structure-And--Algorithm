import java.util.*;

public class Any_Base_Multiplication{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }
 
 
 public static int getProduct(int b, int n1, int n2){
     
    int total = 0;
    int power = 1;
     
    while(n2 != 0){
        
        int r = n2 % 10;
        
        int val = one_to_many(b , n1, r);
        
        total = Add_two(b , total, val*power);
        
        power *= 10;
        n2 /= 10;
        
    }
    
    return total;
     
 }
 
 
 
 public static int one_to_many(int b , int n1 , int n2){
     
     int power = 1;
     int total = 0;
     int r = 0;
     
     while( n1 != 0 || r != 0){
         
         int r1 = n1 % 10;
         int sum = r1*n2 + r;
         
         int val = sum % b ;
         r = sum /b;
         
         total += val * power;
         power *= 10;
         n1 /= 10;
         
     }
     
     return total ;
     
 }
 
 public static int Add_two(int b , int n1 , int n2){
     
     int total = 0;
     int power = 1;
     int r = 0;
     
     while( n1 != 0 || n2 != 0 || r != 0 ){
         
        int r1 = n1 % 10;
        int r2 = n2 % 10;
        
        int sum = r1 + r2 + r;
        
        int val = sum % b;
        r = sum / b;
        
        total += val*power;
        power *= 10;
        
        n1 /= 10;
        n2 /= 10;
        
     }
     
     return total ;
     
 }

 

}
