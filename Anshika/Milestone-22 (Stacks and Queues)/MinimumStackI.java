//https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/minimum-stack-i-official/ojquestion

import java.io.*;
import java.util.*;

public class MinimumStackI {

    public static class MinStack {
        Stack<Integer> allData;
        Stack<Integer> minData;

        public MinStack() {
            allData = new Stack<Integer>();
            minData = new Stack<Integer>();
        }

        int size() {
            // write your code here
            return allData.size();
        }

        void push(int val) {
            // write your code here
            allData.push(val);

            if (minData.size()==0 || val<=minData.peek()) {
                minData.push(val);
            }
        }

        int pop() {
            // write your code here
            int val= allData.pop();

            if (minData.size()>0 && val==minData.peek()) {
                minData.pop();
            }

            return val;
        }

        int top() {
            // write your code here
            return allData.peek();
        }

        int min(){
            // write your code here
            if (minData.size()>0)
                return minData.peek();

            return -1;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MinStack st = new MinStack();

        String str = br.readLine();
        while(str.equals("quit") == false){
            if(str.startsWith("push")){
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            } else if(str.startsWith("pop")){
                int val = st.pop();
                if(val != -1){
                    System.out.println(val);
                }
            } else if(str.startsWith("top")){
                int val = st.top();
                if(val != -1){
                    System.out.println(val);
                }
            } else if(str.startsWith("size")){
                System.out.println(st.size());
            } else if(str.startsWith("min")){
                int val = st.min();
                if(val != -1){
                    System.out.println(val);
                }
            }
            str = br.readLine();
        }
    }
}