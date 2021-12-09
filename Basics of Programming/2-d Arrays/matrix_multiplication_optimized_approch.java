import java.io.*;
import java.util.*;

public class matrix_multiplication_optimized_approch {

public static Scanner scn = new Scanner(System.in);

public static void input(int[][] A){

    for( int i =0; i<A.length;i++){
        for( int j =0; j<A[i].length; j++){
            A[i][j] = scn.nextInt();
        }
    }

}

public static void display(int[][] A){
    for( int i =0; i<A.length; i++){
        for( int j =0; j<A[i].length; j++){
            System.out.print(A[i][j]+ " ");
        }
        System.out.println();
    }
}

public static int[][] matrixMultiply(int[][] A, int[][] B){

    int n1 = A.length;
    int m1 = A[0].length;

    int n2 = B.length;
    int m2 = B[0].length;

    int[][] arr3 = new int[n1][m2];

    for( int i = 0; i<n1 ;i++){
        
        for( int j = 0; j<m2 ; j++){ 
            int total = 0;
            for( int k =0; k< m1; k++ ){
                total += A[i][k]*B[k][j];
            }       
                
        arr3[i][j] = total;
        }
        
    }

    return arr3;

}


public static void main(String[] args) throws Exception {
    int n1 = scn.nextInt();
    int m1 = scn.nextInt();
    
    int [][] A = new int[n1][m1];
    input(A);
    
    int n2 = scn.nextInt();
    int m2 = scn.nextInt();
    
    int [][] B = new int[n2][m2];
    input(B);
    
    if(m1 != n2){
        System.out.println("Invalid input");
    }
    else{
        int [][] C =matrixMultiply(A,B);
        display(C);   
    }
 }

}

