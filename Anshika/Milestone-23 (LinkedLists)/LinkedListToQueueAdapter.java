//https://www.pepcoding.com/resources/online-java-foundation/linked-lists/linked-list-to-queue-adapter-official/ojquestion

import java.util.LinkedList;

public class LinkedListToQueueAdapter {
    LinkedList<Integer> list;

    public LinkedListToQueueAdapter() {
      list = new LinkedList<Integer>();
    }

    int size() {
      // write your code here
      return list.size();
    }

    void add(int val) {
      // write your code here
      list.addLast(val);
    }

    int remove() {
      // write your code here
      if (size()==0) {
          System.out.println ("Queue underflow");
          return -1;
      }
      
      int x=list.getFirst();
      list.removeFirst();
      return x;
    }

    int peek() {
      // write your code here
      if (size()==0) {
          System.out.println ("Queue underflow");
          return -1;
      }
      return list.getFirst();
    }
  }
