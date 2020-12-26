//https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/smallest-number-following-pattern-official/ojquestion

import java.io.*;
import java.util.*;

public class SmallestNumberFollowingPattern{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Stack<Integer> st=new Stack<Integer>();
        int n=1;
        String s="";

        for (int i=0; i<str.length(); i++) {

            char ch=str.charAt(i);

            if (ch=='d') {
                st.push(n);
                n++;
            } else {
                st.push(n);
                n++;

                while (st.size()!=0) {
                    s=s+st.pop();
                }
            }

        }

        st.push(n);

        while (st.size()!=0) {
            s=s+st.pop();
        }

        System.out.println (s);
        // code
    }
}