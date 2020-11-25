//https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/stock-span-official/ojquestion

import java.io.*;
import java.util.*;

public class StockSpan{
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] span = solve(a);
        display(span);
    }

    public static int[] solve(int[] arr){
        // solve
        int[] ar=new int[arr.length];

        //   for (int i=0; i<arr.length; i++) {
        //       int j=i-1;
        //       int cnt=1;
        //       while (j>=0 && arr[j]<arr[i]) {
        //           cnt++;
        //           j--;
        //       }

        //       ar[i]=cnt;
        //   }

        ar[0]=1;
        Stack<Integer> st=new Stack<Integer>();
        st.push(0);

        for (int i=1; i<ar.length; i++) {

            while (st.size()>0 && arr[st.peek()]<=arr[i]) {
                st.pop();
            }

            if (st.size()==0) {
                ar[i]=i+1;
            } else {
                ar[i]=i-st.peek();
            }

            st.push(i);
        }

        return ar;
    }

}