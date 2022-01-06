import java.io.*;
import java.util.*;

public class Get_Maze_Paths {


    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        ArrayList<String> ans = getMazePaths(0 , 0 , n-1 , m-1 );
        System.out.println(ans);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if( sr == dr && sc == dc){
            ArrayList<String> a3 = new ArrayList<>();
            a3.add("");
            return a3;
        }

        ArrayList<String> ans = new ArrayList<>();

        if( sc + 1 <= dc ){
            ArrayList<String> a2 = getMazePaths( sr , sc+1 , dr , dc);
            for(String ele : a2){

               ele =  "h"+ ele;
               ans.add(ele);

            }
        }

        if( sr + 1 <= dr){
            ArrayList<String> a1 = getMazePaths( sr+1 , sc , dr , dc);
            for(String ele : a1){
                ele= "v" + ele;
                ans.add(ele);
            }
        }
        


        return ans;

    }

}
    

