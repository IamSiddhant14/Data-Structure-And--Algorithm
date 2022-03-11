import java.io.*;
import java.util.*;

public class Main {

  public static Boolean ans( String s ) {

    Stack<Character> st = new Stack<>();

    for ( int i = 0; i < s.length() ; i++) {

      char ch = s.charAt(i);
      if ( ch == '(' || ch == '{' || ch == '[') {
          
        st.push(ch);
      } else if (  ch == ')' || ch == '}' ||  ch == ']' ) {
          
        if ( st.size() == 0 )
          return false;
        else if ( ch == ')' && st.peek() != '(')
          return false;
        else if ( ch == '}' && st.peek() != '{')
          return false;
        else if ( ch == ']' && st.peek() != '[')
          return false;
        else {
          st.pop();
        }
        
      }

    }
    // System.out.println( st.size() );
    return st.size() == 0;

  }

  public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);
    String s = scn.next();

    System.out.println(ans(s));

  }

}