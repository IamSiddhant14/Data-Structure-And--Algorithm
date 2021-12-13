
import java.util.*;

public class String_With_Difference_Of_Every_Two_Consecutive_Characters {


	public static String solution(String str){
		
		StringBuilder sb = new StringBuilder();
    
	    int i =0;
		while( i < str.length() -1){

			char s1 = str.charAt(i++);
			char s2 = str.charAt(i);

			int s3 = s2 - s1;

			sb.append(s1);
			sb.append(s3);
			

		}
		sb.append(str.charAt(str.length() -1));

		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
    