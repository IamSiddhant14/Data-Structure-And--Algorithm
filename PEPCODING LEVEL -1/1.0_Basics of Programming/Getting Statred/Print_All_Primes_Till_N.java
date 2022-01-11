import java.util.*;

public class Print_All_Primes_Till_N {
  public static void main(String[] args) {
    
    //TAke input of two numbers low and heigh after that iterate each number bewteen them and including them
    //divide each number starting from 2 uptill the square root of it after that if any number devides it completely then 
    //inc flag by one and break and also if flag ==1 print not prime else print prime for that number
    // now start with a new number in the iteration
    Scanner scn = new Scanner(System.in);
    int low =  scn.nextInt();
    int high = scn.nextInt();
    for (int i = low ; i <= high ; i++) {
      int flag = 0;
      for ( int j = 2; j * j <= i; j++) {

        if ( i % j == 0) {
            flag++;
          break;
        }

      }
      
      if (flag ==0){
          System.out.println(i);
      }
    }
    scn.close();
  }
}


