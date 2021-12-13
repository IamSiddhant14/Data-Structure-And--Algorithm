import java.util.*;

public class Digits_Of_A_Number {

  public static void main(String[] args) {
    // Here in this question we need to print the input digit each number from start to end row wise
    // to do this we frist need to count the digit in that number then after that Math.pow(10 ,count -1);
    // now untile this power != 0 print(n/power) , power =/10 , n=n%power .
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
    scn.close();
  }
}
