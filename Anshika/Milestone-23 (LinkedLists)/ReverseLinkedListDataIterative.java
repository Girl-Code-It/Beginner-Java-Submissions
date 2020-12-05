//https://www.pepcoding.com/resources/online-java-foundation/linked-lists/reverse-di-official/ojquestion

public class ReverseLinkedListDataIterative {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    private Node getNode(int i) {
        Node temp=head;
        int j=0;
        while (j<i) {
            temp=temp.next;
            j++;
        }
        
        return temp;
    }

    public void reverseDI() {
      // write your code here
      int l=0, r=size-1;
      
      while (l<r) {
          
          Node left=getNode(l);
          Node right=getNode(r);
          
          int temp=left.data;
          left.data=right.data;
          right.data=temp;
          
          l++;
          r--;
      }
    }
  }
}