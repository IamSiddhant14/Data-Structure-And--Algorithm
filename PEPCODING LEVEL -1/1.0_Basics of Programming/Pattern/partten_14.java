import java.util.*;

public class partten_14 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n =scn.nextInt();
        
        for( int j =1;j<=10;j++){
           
                // System.out.println(n+"\t"+"*\t"+j+"\t"+"=\t"+j*n);
                System.out.println(n+" * "+j+" = "+j*n);
        }
        scn.close();
    }
    
}
