import java.util.*;

public class Toggle_Case {

	public static String toggleCase(String str){

        //Here in this question we are using string builders so as to avoid tle error as in string in order to insert a 
        // performe conacatenation opertion is an time wise expensive task
		StringBuilder sb = new StringBuilder();

		// S - 'A' = s - 'a';

		for( int i =0; i< str.length(); i++){

			char s = str.charAt(i);

			if( s >= 'A' && s <= 'Z'){

               char c = (char)(s - 'A' + 'a');
			   sb.append(c);

			}else{

				char c = (char)(s - 'a' +'A');
				sb.append(c);

			}
		}

		return sb.toString();
		

	}


	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}
}

