//https://www.pepcoding.com/resources/online-java-foundation/linked-lists/mergesort-linkedlist-official/ojquestion


public class MergseSortALinkedList {
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
      LinkedList ml = new LinkedList();

      Node one = l1.head;
      Node two = l2.head;
      while (one != null && two != null) {
        if (one.data < two.data) {
          ml.addLast(one.data);
          one = one.next;
        } else {
          ml.addLast(two.data);
          two = two.next;
        }
      }

      while (one != null) {
        ml.addLast(one.data);
        one = one.next;
      }

      while (two != null) {
        ml.addLast(two.data);
        two = two.next;
      }

      return ml;
    }
    
    private static Node midNode (Node head, Node tail) {
        Node temp1=head;
        Node temp2=head;
        
        while (temp2!=tail && temp2.next!=tail) {
            temp1=temp1.next;
            temp2=temp2.next.next;
        }
        
        return temp1;
        
    }

    public static LinkedList mergeSort(Node head, Node tail){
      // write your code here
      
      if (head==tail) {
          
          LinkedList li=new LinkedList ();
          li.addLast (head.data);
          
          return li;
      } else {
          
          Node mid=midNode(head,tail);
          LinkedList a=mergeSort (head,mid);
          LinkedList b=mergeSort (mid.next,tail);
          
          return mergeTwoSortedLists (a,b);
          
      } 
    }
  }
}