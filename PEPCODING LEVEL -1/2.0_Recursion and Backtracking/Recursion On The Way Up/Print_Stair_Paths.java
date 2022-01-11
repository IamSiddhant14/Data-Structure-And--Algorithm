
import java.io.*;
import java.util.*;

public class Print_Stair_Paths {
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printStairPaths(n ,"");
    }

    public static void printStairPaths(int n, String path) {

        if( n == 0 ){
            System.out.println(path);
        }

        
        if(n-1 >= 0){
            printStairPaths(n-1,path+1);
        }
        
        if( n-2 >= 0){
            printStairPaths(n-2,path+2);
        }
        if( n-3 >= 0){
            printStairPaths(n-3,path+3);
        }
        
        
    }

}


