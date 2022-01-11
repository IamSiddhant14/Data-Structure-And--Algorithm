import java.io.*;
import java.util.*;

public class Print_All_Palindromic_Substrings {
    
    
    public static void allSubstring (String str){
        

        for( int i = 0; i< str.length(); i++){

            String s = str.substring(0,i+1);

            int st = 0;
            int en = s.length()-1;

            boolean printop = true;

            while( st < en){

                if( s.charAt(st++) != s.charAt(en--)){

                     printop = false;
                     break ;

                }
                

            }
            if( printop ){
                System.out.println(s);
            }

        }


    }


	public static void solution(String str){
		
        for( int i = 0 ; i< str.length() ; i++){

            String s = str.substring(i);
            allSubstring( s );
            
        }
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}

