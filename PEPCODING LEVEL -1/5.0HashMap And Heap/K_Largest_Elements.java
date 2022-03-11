import java.util.*;
 import java.lang.*;
 import java.io.*;
 class Main
  {
 	 public static void main (String[] args) throws IOException
 	  {
 	 	 Scanner scn= new Scanner(System.in);
 	    	 int n = scn.nextInt();
 	 	 int[] num = new int[n];
 	 	 for (int i = 0; i < n; i++) {
 	 	 	 	 num[i] = scn.nextInt();
 	 	 	 }
 	 	 int k = scn.nextInt();
 	 	 solve(n,num,k);
 	  }

	   
 	 // -----------------------------------------------------
 	 // This is a functional problem. Only this function has to be written.
 	 // This function takes as input an array,n length of array and k.
 	 // It should print required output.

 	  public static void solve(int n,int[] arr,int k){
 	     
		  PriorityQueue<Integer> pq = new PriorityQueue<>();

		  for( int i =0; i<k; i++){
			  pq.add(arr[i]);
		  }

		  for( int i = k ; i<arr.length ; i++){

			  int val = pq.peek();

			  if( val < arr[i]){
				  pq.remove();
				  pq.add(arr[i]);
			  }
		  }

		  ArrayList<Integer> al = new ArrayList<Integer>();

		  while( pq.size() != 0 ){
			  al.add(pq.remove());
		  }

		  for( int i = al.size() - 1; i>= 0 ; i--){
			  System.out.print(al.get(i)+" ");
		  }

     }
 }