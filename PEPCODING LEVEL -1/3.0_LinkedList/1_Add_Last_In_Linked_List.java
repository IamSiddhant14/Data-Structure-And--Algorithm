

// int [] a = {1,2,3,4,5,6};
// int [] b = new int [a.length];


// Here we have used this "new" keyword which help us in creating an new copy ,but if would not have used new in that case a shallow copy would have been created , because of which any change made on array "b" will refelect in array "a " as well

// for (int i = 0; a.length; i++){
//     b[i] = a[i];
// }
          
import java.io.*;
import java.util.*;

class Add_Last_In_Linked_List {

  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    void addLast(int val) {
      Node temp = new Node();
      temp.data =  val;
      
      if( size == 0){
          head = temp;
          tail = temp;
          
      }else{
          
          tail.next = temp;
          tail = temp;
          tail.next = null;
          
      }
      
      size++;
    }
  }

  public static void testList(LinkedList list) {
    for (Node temp = list.head; temp != null; temp = temp.next) {
      System.out.println(temp.data);
    }
    System.out.println(list.size);

    if (list.size > 0) {
      System.out.println(list.tail.data);
    } 
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LinkedList list = new LinkedList();

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("addLast")){
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addLast(val);
      } 
      str = br.readLine();
    }

    testList(list);
  }
}
    
