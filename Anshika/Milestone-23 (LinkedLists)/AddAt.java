//https://www.pepcoding.com/resources/online-java-foundation/linked-lists/add-at-index-in-linked-list-official/ojquestion

public class AddAt {
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
      temp.data = val;
      temp.next = null;

      if (size == 0) {
        head = tail = temp;
      } else {
        tail.next = temp;
        tail = temp;
      }

      size++;
    }

    public void addFirst(int val) {
      Node temp = new Node();
      temp.data = val;
      temp.next = head;
      head = temp;
      
      if(size == 0){
        tail = temp;
      }

      size++;
    }

    public void addAt(int idx, int val){
      // write your code here
      if (idx>size) {
          System.out.println ("Invalid arguments");
          return;
      } 
      
      if (idx==0) {
          addFirst(val);
          return;
      } else if (idx==size) {
          addLast(val);
          return;
      }
      
      Node temp=new Node();
      temp.data=val;
      int i=0;
      Node temp1=head;
      
      while (i<idx-1) {
          temp1=temp1.next;
          i++;
      }
      
      temp.next=temp1.next;
      temp1.next=temp;
      size++;
    }
  }
}