
import java.io.*;
import java.util.*;

public class Get_Stair_Paths_using_loops {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        ArrayList<String> a = getStairPaths(n);
        System.out.println(a);

    }

    public static ArrayList<String> getStairPaths(int n) {

        if( n == 0 ){

            ArrayList<String> a = new ArrayList<>();
            a.add("");
            return a;

        }

        ArrayList<String> ans = new ArrayList<>();

        for( int i = 1; i<= 3; i++){
            if( n-i >= 0){
                ArrayList<String> recAns = getStairPaths(n-i);
                for( String ele : recAns){
                   ans.add(i+ele);
                }
            }

        }


        return ans;
        
        
        
    }

}
    

