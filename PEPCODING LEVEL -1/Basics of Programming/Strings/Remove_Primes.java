import java.io.*;
import java.util.*;

public class Remove_Primes {

// import java.io.*;
// import java.util.*;

// public class Main {

// 	public static void solution(ArrayList<Integer> al){

//         for( int j = 0; j < al.size() ; j++){

//             int c = al.get(j);
//             boolean val = false;

//             for( int i =2; i*i <= c; i++){

//                 if( c % i == 0){
//                     val = true;
//                     break;
//                 } 
//             }

//             if( val == false ){
//                 al.remove(j);
//             }
            
//         }
		
        		
// 	}
// 	public static void main(String[] args) {
// 		Scanner scn = new Scanner(System.in);
// 		int n = scn.nextInt();
// 		ArrayList<Integer> al = new ArrayList<>();
// 		for(int i = 0 ; i < n; i++){
// 			al.add(scn.nextInt());
// 		}
// 		solution(al);
// 		System.out.println(al);
// 	}

// }




	public static void solution(ArrayList<Integer> al){

        for( int j = al.size() -1; j >= 0 ; j--){

            int c = al.get(j);
            boolean val = false;

            for( int i =2; i*i <= c; i++){

                if( c % i == 0){
                    val = true;
                    break;
                } 
            }

            if( val == false ){
                al.remove(j);
            }
            
        }
		
        		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

    


    
}
