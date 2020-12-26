//https://www.pepcoding.com/resources/online-java-foundation/linked-lists/remove-last-in-linked-list/ojquestion

public class RemoveLast {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    public void removeLast(){
      // write your code here
      if (size==0) {
          System.out.println ("List is empty");
      } else if (size==1) {
          head=null;
          tail=null;
          size--;
      } else {
          Node temp=head;
          while (temp.next!=tail) {
              temp=temp.next;
          }
          temp.next=null;
          tail=temp;
          size--;
      }
    }
  }
}
