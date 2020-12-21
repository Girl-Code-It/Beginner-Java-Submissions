//https://www.pepcoding.com/resources/online-java-foundation/linked-lists/add-two-linkedlists-official/ojquestion

public class AddTwoLinkedLists {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;
    
    public void addFirst(int val) {
      Node temp = new Node();
      temp.data = val;
      temp.next = head;
      head = temp;

      if (size == 0) {
        tail = temp;
      }

      size++;
    }

    private static int summation (Node node1, int pv1, Node node2, int pv2, LinkedList result) {
        
        if (node1==null && node2==null) {
            return 0;
        } else {
            
            int carry=0, data=0;
            
            if (pv1>pv2) {
                
                carry=summation (node1.next, pv1-1, node2, pv2, result);
                data=node1.data+carry;
                
            } else if (pv2>pv1) {
                
                carry=summation (node1, pv1, node2.next, pv2-1, result);
                data=node2.data+carry;
                
            } else {
                
                carry=summation (node1.next, pv1-1, node2.next, pv2-1, result);
                data=node1.data+node2.data+carry;
            }
            
            int sum=data%10;
            carry=data/10;
            
            result.addFirst (sum);
            
            return carry;
        }
    }

    public static LinkedList addTwoLists(LinkedList one, LinkedList two) {
      // write your code here
      
      LinkedList result=new LinkedList();
      int carry=summation (one.head, one.size, two.head, two.size, result);
      
      if (carry>0) {
          result.addFirst (carry);
      }
      
      return result;
    }
  }
}