//https://www.pepcoding.com/resources/online-java-foundation/linked-lists/remove-first-linked-list-official/ojquestion

public class RemoveFirst {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;


    public void removeFirst(){
      // write your code here
      if (size==0) {
          System.out.println ("List is empty");
      } else if (size==1) {
          head=null;
          tail=null;
          size--;
      } else {
          head=head.next;
          size--;
      }
    }
  }
}