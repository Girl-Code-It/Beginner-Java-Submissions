//https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/stack-to-queue-adapter-add-efficient-official/ojquestion

import java.io.*;
import java.util.*;

public class StackToQueueAdapterAddEfficient {

    public static class StackToQueueAdapter {
        Stack<Integer> mainS;
        Stack<Integer> helperS;

        public StackToQueueAdapter() {
            mainS = new Stack<Integer>();
            helperS = new Stack<Integer>();
        }

        int size() {
            // write your code here
            return mainS.size();
        }

        void add(int val) {
            // write your code here
            mainS.push(val);
        }

        int remove() {
            // write your code here
            if (size()==0) {
                System.out.println ("Queue underflow");
                return -1;
            } else {
                int x;

                while (mainS.size()!=1) {
                    int y=mainS.pop();
                    helperS.push(y);
                }

                x=mainS.pop();

                while (helperS.size()!=0) {
                    int y=helperS.pop();
                    mainS.push(y);
                }

                return x;
            }
        }

        int peek() {
            // write your code here
            if (size()==0) {
                System.out.println ("Queue underflow");
                return -1;
            } else {
                int x=-1;

                while (mainS.size()!=0) {
                    int y=mainS.pop();
                    helperS.push(y);
                }

                x=helperS.peek();

                while (helperS.size()!=0) {
                    int y=helperS.pop();
                    mainS.push(y);
                }

                return x;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StackToQueueAdapter qu = new StackToQueueAdapter();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("add")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.add(val);
            } else if (str.startsWith("remove")) {
                int val = qu.remove();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("peek")) {
                int val = qu.peek();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(qu.size());
            }
            str = br.readLine();
        }
    }
}