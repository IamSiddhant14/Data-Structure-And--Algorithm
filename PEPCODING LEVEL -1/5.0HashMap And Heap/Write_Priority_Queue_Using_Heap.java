
    import java.io.*;
    import java.util.*;

public class Write_Priority_Queue_Using_Heap {

  public static class PriorityQueue {
    ArrayList<Integer> data;

    public PriorityQueue() {
      data = new ArrayList<>();
    }
    //For swaping elements in arraylist we use "get" and "set" functions
    public void add(int val) {

      data.add(val);
      upHeapify(data.size() - 1);// We will be passing in the index of element which need to be upHeapified

    }

    public void upHeapify (int idx ){

      if( idx == 0){
        return;
      }

      int pi = (idx - 1)/2;

      if( data.get(idx) < data.get(pi)){
        swap(idx , pi);
        upHeapify(pi);
      }

    }

    public void swap ( int i , int j){

      int v1 = data.get(i);
      int v2 = data.get(j);

      data.set(i , v2);
      data.set(j , v1); 
    }

    public int remove() {
      
      int val = peek();
      if( val == -1){
        return val;
      }
  
      swap( 0 , data.size()-1);
      data.remove(data.size()-1);
      downHeapify(0);

      return val;
    }

    public void downHeapify(int pi){

      int minIdx = pi;

      int li = 2*pi+1;
      int ri = 2*pi+2;

      if( li < data.size() && data.get(li) < data.get(minIdx) ){
            minIdx = li;
      }

      if( ri < data.size() && data.get(ri) < data.get(minIdx) ){
            minIdx = ri;
      }

      if( minIdx != pi ){
        swap( minIdx , pi);
        downHeapify(minIdx);
      }

    }

    public int peek() {

      if( data.size() == 0){
        System.out.println("Underflow" );
        return -1;
      }

      int val = data.get(0);
      return val;

    }

    public int size() {// o(1)
      return data.size();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PriorityQueue qu = new PriorityQueue();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}
    

