import java.util.*;
import java.io.*;
public class Find_Mid_bw_given_two_nodes {

    public static class Node{
        int data ;
        Node next ;
    }


    public static Node FindMid(Node head , Node tail){

        Node slow = head;
        Node fast = head;

        

        while(fast != tail && fast.next != tail){
            slow = slow.next;
            fast = fast.next.next; 
        }
        return slow;


    }


    
}
