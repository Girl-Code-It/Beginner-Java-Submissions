//https://www.pepcoding.com/resources/online-java-foundation/linked-lists/mid-linked-list-official/ojquestion

public class MidOfLinkedList {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    public int mid(){
      // write your code here
      Node temp1=head, temp2=head;
      
      while (temp2.next!=null && temp2.next.next!=null) {
          temp1=temp1.next;
          temp2=temp2.next.next;
      }
      
      return temp1.data;
    }
  }
}