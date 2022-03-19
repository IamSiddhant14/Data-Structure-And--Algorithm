import java.util.*;
import java.io.*;


public class infixEvalutaion {

    public static boolean isOpr( char s ){

        if( s == '+' || s == '-' || s == '*' || s == '/'){
            return true;
        }

        return false;
    }

    public static int precedence(char ch){

        if( ch == '+' || ch == '-'){
            return 1;
        }

        return 2;
    }

    public static int vCal ( int v1 , int v2 , char optr ){
        int sum = 0;

        if( optr == '+' ){
            sum = v1 + v2;

        }else if( optr == '-' ){
            sum = v1 - v2;

        }else if( optr == '*' ){
            sum = v1 * v2;

        }else if( optr == '/' ){
            sum = v1 / v2;

        }

        return sum;

    }

    public static void main( String [] args ){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = scn.nextLine();

        Stack<Character> operator = new Stack<> () ;
        Stack<Integer> operand = new Stack<> () ;

        for( char ch : exp.toCharArray() ){

            if( ch == '(' ){
                operator.push(ch);

            }else if( ch == ')' ){
                
                while( operand.peek() != '('  ){
                    
                    char optr = operator.pop();

                    int v2 = operand.pop();
                    int v1 = operand.pop();

                    int num = vCal( v1 , v2 , optr);
                    operand.push(num);
                }

                operator.pop();

            }else if ( ch >= '0' && ch <= '9'){
                operand.push(ch - '0');

            }else if( isOpr(ch) ){

                while( operator.size() != 0 && operator.peek() != '(' && precedence(ch) <= precedence(operator.peek()) ){

                    char optr = operator.pop();     //+-x/
                    int v2 = operand.pop();
                    int v1 = operand.pop();
                    int ans = vCal(v1,v2,optr);
                    operand.push(ans);

                }

                operator.push(ch);



            }



        }

        while(operator.size () != 0){
            char optr = operator.pop();     //+-x/
            int v2 = operand.pop();
            int v1 = operand.pop();
            int ans = vCal(v1,v2,optr);
            operand.push(ans);
        }
        
        System.out.println(operand.peek());
    }

    

}