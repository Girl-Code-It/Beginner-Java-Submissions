//https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/sliding-window=maximum-official/ojquestion

import java.io.*;
import java.util.*;

public class SlidingWindowMaximum{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] ar = new int[n];
        for(int i = 0; i < n; i++){
            ar[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        Stack<Integer> st=new Stack<Integer>();

        int[] nextg=new int[n];
        nextg[n-1]=-1;
        st.push(n-1);

        for (int i=n-2; i>=0; i--) {
            while (st.size()>0 && ar[st.peek()]<=ar[i]) {
                st.pop();
            }

            if (st.size()==0) {
                nextg[i]=-1;
            } else {
                nextg[i]=st.peek();
            }

            st.push(i);
        }

        int[] window=new int[n-k+1];

        int j;
        for (int i=0; i<window.length; i++) {

            j=i;
            while (nextg[j]<i+k && nextg[j]>0) {
                j=nextg[j];
            }
            window[i]=ar[j];
        }

        for (int i=0; i<window.length; i++) {
            System.out.println (window[i]);
        }

        // code
    }
}