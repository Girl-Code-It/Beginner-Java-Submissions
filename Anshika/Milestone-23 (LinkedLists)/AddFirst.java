//https://www.pepcoding.com/resources/online-java-foundation/linked-lists/add-first-in-linked-list-official/ojquestion

public class AddFirst {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    public void addFirst(int val) {
      // write your code here
      Node temp=new Node();
      temp.data=val;
      
      if (head==null) {
          head=temp;
          tail=temp;
      } else {
          temp.next=head;
          head=temp;
      }
      size++;
    }
  }
}