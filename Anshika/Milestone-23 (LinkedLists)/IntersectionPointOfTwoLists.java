//https://www.pepcoding.com/resources/online-java-foundation/linked-lists/intersection-of-linked-lists-official/ojquestion

public class IntersectionPointOfTwoLists {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    public static int findIntersection(LinkedList one, LinkedList two){
      // write your code here
      
    //   Node temp1=one.head, temp2;
      
    //   while (temp1!=null) {
          
    //       temp2=two.head;
    //       while (temp2!=null) {
              
    //           if (temp1==temp2) {
    //               return temp1.data;
    //           }
              
    //           temp2=temp2.next;
    //       }
          
    //       temp1=temp1.next;
    //   }
      
    //   return 0;
    
    
    int dis=Math.abs(one.size-two.size);
    Node temp1=one.head;
    Node temp2=two.head;
    int i=0;
    
    if (one.size>two.size) {
        
        while (i!=dis) {
            temp1=temp1.next;
            i++;
        }
        
    }else {
        
        while (i!=dis) {
            temp2=temp2.next;
            i++;
        }
        
    }
    
    while (temp1!=temp2) {
        temp1=temp1.next;
        temp2=temp2.next;
    }
    
    return temp1.data;
    }
  }
}