import java.io.*;
import java.util.*;

public class Get_Stair_Paths {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        ArrayList<String> a = getStairPaths(n);
        System.out.println(a);

    }

    public static ArrayList<String> getStairPaths(int n) {

        if( n == 0 ){
            
            ArrayList<String> a = new ArrayList<>();
            a.add("");//Here we are not returning an empty arrayList because we want to run our loop in line number 30 , and if we return an empty arraylist then it would result in not running the loop and hence our one step wont be counted 
            return a; 

        }

        ArrayList<String> ans = new ArrayList<>();

        if( n-1 >= 0){
            ArrayList<String> num1 = getStairPaths(n-1);
            for( String ele : num1){
                ans.add("1"+ele);
            }
        }

        if( n-2 >= 0){
            ArrayList<String> num2 = getStairPaths(n-2);
            for( String ele : num2){
                ans.add("2"+ele);
            }
        }

        if( n-3 >= 0){
            ArrayList<String> num3 = getStairPaths(n-3);
            for( String ele : num3){
                ans.add("3"+ele);
            }
        }


        return ans;
        
        
        
    }

}
    

