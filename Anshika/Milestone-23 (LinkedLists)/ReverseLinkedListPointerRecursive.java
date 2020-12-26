//https://www.pepcoding.com/resources/online-java-foundation/linked-lists/reverse-linkedlist-pr-official/ojquestion


public class ReverseLinkedListPointerRecursive {
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

    public void removeFirst() {
      if (size == 0) {
        System.out.println("List is empty");
      } else if (size == 1) {
        head = tail = null;
        size = 0;
      } else {
        head = head.next;
        size--;
      }
    }

    private void reversePRHelper(Node node){
      // write your code here
      if (node.next!=null) {
          
          int store=node.data;
          removeFirst();
          
          reversePRHelper (node.next);
          addLast(store);
      }
    }

    public void reversePR(){
      // write your code here
      reversePRHelper(head);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
    }
  }
}
