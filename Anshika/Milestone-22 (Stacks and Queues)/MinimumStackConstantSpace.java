//https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/min-stack-ii-official/ojquestion

import java.io.*;
import java.util.*;

public class MinimumStackConstantSpace {

  public static class MinStack {
    Stack<Integer> data;
    int min;

    public MinStack() {
      data = new Stack<Integer>();
    }

    int size() {
      // write your code here
      return data.size();
    }

    void push(int val) {
      // write your code here
      if (data.size()==0) {
          min=val;
          data.push(val);
      }else {
          if (val<=min){
              int x=2*val-min;
              min=val;
              data.push(x);
          } else {
              data.push(val);
          }
      }
    }

    int pop() {
      // write your code here
      int x=data.pop();
      if (x<=min) {
          int temp=min;
          min=2*min-x;
          x=temp;
      }
      
      return x;
    }

    int top() {
      // write your code here
      
      int x=data.peek();
      if (x<=min) {
         x=min;
      }
      
      return x;
      
    }

    int min() {
      // write your code here
      return min;
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    MinStack st = new MinStack();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("push")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if (str.startsWith("pop")) {
        int val = st.pop();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("top")) {
        int val = st.top();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(st.size());
      } else if (str.startsWith("min")) {
        int val = st.min();
        if (val != -1) {
          System.out.println(val);
        }
      }
      str = br.readLine();
    }
  }
}