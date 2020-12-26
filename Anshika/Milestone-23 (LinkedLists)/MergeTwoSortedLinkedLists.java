//https://www.pepcoding.com/resources/online-java-foundation/linked-lists/merge-two-sorted-linked-lists-official/ojquestion

public class MergeTwoSortedLinkedLists {
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

    public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
      // write your code hered
      LinkedList li=new LinkedList();
      Node temp1=l1.head;
      Node temp2=l2.head;
      
      while (temp1!=null && temp2!=null) {
          if (temp1.data<=temp2.data) {
              li.addLast(temp1.data);
              temp1=temp1.next;
          } else {
              li.addLast(temp2.data);
              temp2=temp2.next;
          }
      }
      
      while (temp1!=null) {
          li.addLast(temp1.data);
          temp1=temp1.next;
      }
      
      while (temp2!=null) {
          li.addLast(temp2.data);
          temp2=temp2.next;
      }
      
      return li;
    }
  }
}
