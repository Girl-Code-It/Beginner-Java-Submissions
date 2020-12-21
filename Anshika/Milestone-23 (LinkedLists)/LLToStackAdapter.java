//https://www.pepcoding.com/resources/online-java-foundation/linked-lists/linkedlist-to-stack-adapter-official/ojquestion

import java.util.LinkedList;

public class LLToStackAdapter {
    LinkedList<Integer> list;

    public LLToStackAdapter() {
        list = new LinkedList<Integer>();
    }

    int size() {
        // write your code here
        return list.size();
    }

    void push(int val) {
        // write your code here
        list.addFirst(val);
    }

    int pop() {
        // write your code here
        int x=list.getFirst();
        list.removeFirst();
        return x;
    }

    int top() {
        // write your code here
        return list.getFirst();
    }
}