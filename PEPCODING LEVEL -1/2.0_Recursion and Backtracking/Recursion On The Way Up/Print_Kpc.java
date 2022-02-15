import java.io.*;
import java.util.*;

public abstract class Print_Kpc {

    static String[] B = {".;","abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx","yz"};

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        String s = scn.next();

        String  a = "";
        printSS(s , a);

    }

    public static void printSS(String str, String ans) {

        if( str.length() == 0 ){
            System.out.println(ans);
            return;
        }

        char one = str.charAt(0);
        String a = str.substring(1);

        int idx = one - '0';
        String s = B[idx];


        for( int i =0; i<s.length(); i++ ){
            char c = s.charAt(i);
            printSS( a , ans+c);
        }

        
    }

}
