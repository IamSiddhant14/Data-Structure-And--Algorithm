import java.io.*;
import java.util.*;

public class DuplicateBrackets {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        
        Boolean ans = false;
        
        Stack<Character> st = new Stack<>();
        
        for( int i =0; i<s.length() ; i++){
            
            char ch = s.charAt(i);
            
            if( ch != ')'){
                st.push(ch);
            }else{
                // if( st.size() == 0){
                //     System.out.println(ans);
                //     break;
                // }
                
                if( st.peek() == '(' ){
                    ans = true;
                    break;
                }else{
                    
                    while( st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
                    

                
            }
            
        }
        
        System.out.println(ans);
    }

}
    
