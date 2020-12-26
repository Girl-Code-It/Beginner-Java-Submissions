//https://www.pepcoding.com/resources/online-java-foundation/linked-lists/remove-at-linked-list-official/ojquestion

public class RemoveAt {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

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

    public void removeLast() {
      if (size == 0) {
        System.out.println("List is empty");
      } else if (size == 1) {
        head = tail = null;
        size = 0;
      } else {
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
          temp = temp.next;
        }

        tail = temp;
        tail.next = null;
        size--;
      }
    }

    public void removeAt(int idx) {
      // write your code here
      if (idx==0) {
          removeFirst();
      } else if (idx==size-1) {
          removeLast();
      } else if (idx>=size) {
          System.out.println ("Invalid arguments");
      } else {
          
          Node temp=head;
          int i=0;
          while (i<idx-1) {
              temp=temp.next;
              i++;
          }
          temp.next=temp.next.next;
          size--;
      }
    }
  }
}