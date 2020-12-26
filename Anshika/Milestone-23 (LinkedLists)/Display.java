//https://www.pepcoding.com/resources/online-java-foundation/linked-lists/display-linked-list-official/ojquestion

public class Display {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    public int size(){
      // write code here
      return size;
    }

    public void display(){
      // write code here
      Node temp=head;
      while (temp!=null) {
          System.out.print (temp.data+" ");
          temp=temp.next;
      }
      System.out.println ();
    }
  }
}