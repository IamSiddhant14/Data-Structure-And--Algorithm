import java.util.*;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int temp = n;
    int count = 0;
    while ( temp != 0 ) {// when temp becames zero we had counted alll the digits present the number
      count++;
      temp = temp / 10;
    }
    
    int div = (int)Math.pow(10, count - 1);
    
    while( div != 0){//take the case of 10000/10000 or watch solution vedio
        int q = n/div;
        System.out.println(q);
        
        n =n %div;
        div = div/10;
    }
    
  }
}