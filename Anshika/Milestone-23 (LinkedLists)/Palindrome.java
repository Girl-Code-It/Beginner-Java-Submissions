//https://www.pepcoding.com/resources/online-java-foundation/linked-lists/is-linkedlist-palindromic-official/ojquestion

public class Palindrome {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    public int getFirst() {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else {
        return head.data;
      }
    }

    public int getLast() {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else {
        return tail.data;
      }
    }

    public int getAt(int idx) {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else if (idx < 0 || idx >= size) {
        System.out.println("Invalid arguments");
        return -1;
      } else {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
          temp = temp.next;
        }
        return temp.data;
      }
    }

    public boolean IsPalindrome() {
      // write your code here
      int i=0, j=size-1;
      
      while (i<j) {
          int left=getAt(i);
          int right=getAt(j);
          
          if (right!=left) {
              return false;
          }
          
          i++;
          j--;
      } 
      
      return true;
    }
  }

}