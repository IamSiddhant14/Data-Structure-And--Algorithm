import java.io.*;
import java.util.*;

public class Print_Zigzag {


    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int n = scn.nextInt();

        pzz(n);
        
    }

    public static void pzz(int n){

        if( n == 0){
            return;
        }

        System.out.print(n+" ");

        pzz(n -1);

        System.out.print(n+" ");

        pzz(n -1);

        System.out.print(n+" ");

    }

}
    

