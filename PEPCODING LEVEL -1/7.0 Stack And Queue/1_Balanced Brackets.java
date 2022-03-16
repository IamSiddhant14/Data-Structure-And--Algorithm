import java.io.*;
import java.util.*;

 class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        
        boolean ans = true;
        
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length() ; i++){
            char ch = s.charAt(i);
            
            if( ch == '[' || ch == '(' || ch == '{'){
                st.push(ch);
            }else{
                
                if( ch == ')' || ch == '}' || ch == ']'){
                    
                    if( st.size() == 0){
                        ans = false;
                        break;
                    }else if ( ch == ')' &&  st.peek() != '('){
                        ans = false;
                        break;
                    }else if ( ch == '}' &&  st.peek() != '{'){
                        ans = false;
                        break;
                    }else if ( ch == ']' &&  st.peek() != '['){
                        ans = false;
                        break;
                    }else{
                        st.pop();
                    }
                    
                }else{
                    continue;
                }
                
                
            }
        }
        ans = (st.size() == 0) && (ans) ;
        System.out.println(ans);

    }

}