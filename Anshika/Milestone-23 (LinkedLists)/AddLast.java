//https://www.pepcoding.com/resources/online-java-foundation/linked-lists/add-last-linked-list-official/ojquestion

public class AddLast {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    void addLast(int val) {
      // Write your code here
      Node temp=new Node();
      temp.data=val;
      
      if (size==0) {
          head=temp;
          tail=temp;
          size++;
          return;
      }

      tail.next=temp;
      tail=temp;
      size++;
    }
  }
}