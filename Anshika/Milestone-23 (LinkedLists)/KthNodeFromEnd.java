//https://www.pepcoding.com/resources/online-java-foundation/linked-lists/kth-from-last-official/ojquestion

public class KthNodeFromEnd {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;
  
    public int kthFromLast(int k){
      // write your code here
      
      int i=0;
      
      Node temp1=head, temp2=head;
      while (i!=k) {
          temp2=temp2.next;
          i++;
      }
      
      while (temp2.next!=null) {
          temp1=temp1.next;
          temp2=temp2.next;
      }
      
      return temp1.data;
    }
  }
}