import java.io.*;
import java.util.*;

public class Get_Subsequence {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        ArrayList<String> ss = gss(str);
        System.out.println(ss);

    }

    public static ArrayList<String> gss(String str) {

        if( str.length() == 0){

            ArrayList <String> al = new ArrayList<>();
            al.add("");
            return (al);

        }
        char a =  str.charAt(0);
        str = str.substring(1);

        ArrayList <String> so = gss(str );                     //original
        ArrayList <String> sd = new ArrayList<>();             //dublicate   
                                
        for( String ele : so){
            sd.add(ele);
        }

        for( String ele: so){
            String s = a + ele;
            sd.add(s);
        }

        return sd;
    
}
    
}
