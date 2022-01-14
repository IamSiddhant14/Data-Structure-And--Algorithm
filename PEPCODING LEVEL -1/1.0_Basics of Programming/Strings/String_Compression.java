import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
	    
	    StringBuilder sb = new StringBuilder();
	    sb.append(str.charAt(0));
	    
	    for( int i = 1; i<str.length();i++){
	         char one = str.charAt(i-1);
	         char two = str.charAt(i);
	         
	         if( one != two ){
	             sb.append(two);
	         }
	         
	    }
	    
		return  sb.toString();
	}

	public static String compression2(String str){
	    
	    StringBuilder sb = new StringBuilder();
	    sb.append(str.charAt(0));
	    
	    int count = 1;
	    
	    for( int i =1; i<str.length(); i++){
	        
	         char one = str.charAt(i-1);
	         char two = str.charAt(i);
	         if( one == two ){
	             count++ ;
	         }else{
	             if( count > 1){
	                 
	                 sb.append(count);
	                 sb.append(two);
	                 count = 1;
	                 
	             }else{
	                 sb.append(two);
	             }
	         }
	         
	         if( i == str.length()-1 && count >1 ){
	              sb.append(count);
	         }

	    }
		

		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}