//pepcoding.com/resources/online-java-foundation/linked-lists/display-reverse-linkedlist-official/ojquestion

public class DisplayReverseRecursive {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    private void displayReverseHelper(Node node){
      // write your code here
      if (node!=null) {
          displayReverseHelper (node.next);
          System.out.print  (node.data+" ");
      }
    }

    public void displayReverse(){
      displayReverseHelper(head);
      System.out.println();
    }
  }
}