//https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/celebrity-problem-official/ojquestion

import java.io.*;
import java.util.*;

public class CelebrityProblem {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        
        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

    }

    public static void findCelebrity(int[][] arr) {
        // if a celebrity is there print it's index (not position), if there is not then
        // print "none"
        
        Stack<Integer> st=new Stack<Integer>();
        for (int i=0; i<arr.length; i++) {
            st.push(i);
        }
        
        while (st.size()!=1) {
            int i=st.pop();
            int j=st.pop();
            
            if (arr[i][j]==1) {
                st.push(j);
            } else {
                st.push(i);
            }
        }
        
        int ind=st.pop();
        for (int i=0; i<arr.length; i++) {
            if (arr[ind][i]==1) {
                System.out.println ("none");
                return;
            }
        }
        for (int i=0; i<arr.length; i++) {
            if (arr[i][ind]==0 && i!=ind) {
                System.out.println ("none");
                return;
            }
        }
        
        System.out.println (ind);
    }

}