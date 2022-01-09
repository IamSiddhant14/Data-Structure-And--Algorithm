
import java.io.*;
import java.util.*;

public class Print_Subsequence {


    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String ans = "";

        printSS(s ,ans );


    }

    public static void printSS(String str, String ans) {

        if( str.length() == 0){
            System.out.println(ans);
            return;
        }

        char s = str.charAt(0);
        String st = str.substring(1);

        printSS( st , ans+s);
        printSS( st , ans);

    }

}
    

