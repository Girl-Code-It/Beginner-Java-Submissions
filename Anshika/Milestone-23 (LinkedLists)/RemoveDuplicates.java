//https://www.pepcoding.com/resources/online-java-foundation/linked-lists/remove-duplicates-official/ojquestion


public class RemoveDuplicates {
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
      if (idx < 0 || idx >= size) {
        System.out.println("Invalid arguments");
      } else if (idx == 0) {
        removeFirst();
      } else if (idx == size - 1) {
        removeLast();
      } else {
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
          temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
      }
    }

    public void removeDuplicates(){
      // write your code here
      
      Node temp1=head, temp2=head.next;
      int i=0;
      
      while (temp2!=null) {
          if (temp1.data==temp2.data) {
              temp2=temp2.next;
              removeAt(i+1);
          } else {
              temp1=temp1.next;
              temp2=temp2.next;
              i++;
          }
      }

    }
  }
}