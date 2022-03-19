import java.io.*;
import java.util.*;


public class InfixConversions {

    public static int precedence ( char ch ){

        if( ch == '+' || ch == '-' ){
            return 1;
        }
        return 2;
    }

    public static boolean isOpr( char ch){

    if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
        return true;
    }
    return false;
    }
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    Stack<String> post = new Stack<>();
    Stack<String> pre = new Stack<>();

    Stack<Character> operator = new Stack<>();

    for( char ch : exp.toCharArray()){

        if( ch == '('){
            operator.push(ch);

        }else if( (ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ){
            post.push(ch+"");
            pre.push(ch+"");

        }else if ( ch == ')'){

            while( operator.peek() != '('){

                String a2 = post.pop();
                String a1 = post.pop();

                char ao = operator.pop();
                String a = a1+a2+ao;

                post.push(a);


                String b2 = pre.pop();
                String b1 = pre.pop();

              
                String b = ao+b1+b2;

                pre.push(b);

            }

            operator.pop();

        }else if( isOpr(ch)){

            while( operator.size() != 0 && operator.peek() != '(' && precedence(ch) <= precedence(operator.peek())){

                String a2 = post.pop();
                String a1 = post.pop();

                char ao = operator.pop();
                String a = a1+a2+ao;

                post.push(a);


                String b2 = pre.pop();
                String b1 = pre.pop();

              
                String b = ao+b1+b2;

                pre.push(b);

            }

            operator.push(ch);

        }
    }

    while( operator.size() != 0){

                String a2 = post.pop();
                String a1 = post.pop();

                char ao = operator.pop();
                String a = a1+a2+ao;

                post.push(a);

                String b2 = pre.pop();
                String b1 = pre.pop();

                String b = ao+b1+b2;

                pre.push(b);
            
    }

    System.out.println(post.peek());
    System.out.println(pre.peek());
 }
}
    
