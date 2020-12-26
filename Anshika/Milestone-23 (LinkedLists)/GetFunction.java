//https://www.pepcoding.com/resources/online-java-foundation/linked-lists/get-in-linked-list-official/ojquestion

public class GetFunction {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    public int getFirst(){
      // write your code here
      if (size==0) {
          System.out.println ("List is empty");
          return -1;
      }
      
      return head.data;
    }

    public int getLast(){
      // write your code here
      if (size==0) {
          System.out.println ("List is empty");
          return -1;
      }
      
      return tail.data;      
    }

    public int getAt(int idx){
      // write your code here
      if (size==0) {
          System.out.println ("List is empty");
          return -1;
      }
      
      if (idx>=size) {
          System.out.println ("Invalid arguments");
          return -1;
      }
      
      int i=0;
      Node temp=head;
      while (i!=idx) {
          temp=temp.next;
          i++;
      }
      
      return temp.data;
    }
  }
}