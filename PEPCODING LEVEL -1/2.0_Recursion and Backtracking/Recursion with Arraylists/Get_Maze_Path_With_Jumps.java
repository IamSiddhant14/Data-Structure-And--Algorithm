import java.io.*;
import java.util.*;

public class Get_Maze_Path_With_Jumps {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        ArrayList<String> ans = getMazePaths( 0 , 0 , n-1 , m-1 );
        System.out.println(ans);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc ) {

        if( sr == dr && sc == dc ){

            ArrayList<String> p = new ArrayList<>();
            p.add("");

            return p;
        }

        ArrayList<String> a = new ArrayList<>();

        for( int j =1; sc+j <= dc ; j++){

            // if( sc+ j <= dc){

                ArrayList<String> a2 = getMazePaths( sr , sc+j , dr , dc);
                for( String ele : a2){
                    a.add( "h"+j+ele );
                }
            // }

        }


        for( int i = 1; sr+i <= dr; i++){

            // if( sr + i <= dr){

                ArrayList<String> a1 = getMazePaths(sr+i , sc , dr , dc);
                for( String ele : a1){
                    a.add( "v"+i+ele );
                }
                
            // }

        }
       
        
        for( int i = 1; sr+i <= dr && sc+i <= dc; i++ ){

            ArrayList<String> a3 = getMazePaths(sr+i , sc+i , dr , dc);

            for( String ele : a3){
                a.add( "d"+i+ele );
            }

        }         


        return a ;
    }

}
    

