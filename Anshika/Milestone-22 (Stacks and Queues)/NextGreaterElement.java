//https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/next-greater-element-official/ojquestion

import java.io.*;
import java.util.*;

public class NextGreaterElement{
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

        int[] nge = solve(a);
        display(nge);
    }

    public static int[] solve(int[] arr){
        // solve
        int[] ar=new int[arr.length];
        ar[ar.length-1]=-1;
        //   for (int i=0; i<ar.length; i++) {
        //       ar[i]=-1;
        //   }

        //   for (int i=0; i<arr.length; i++) {
        //       for (int j=i+1; j<arr.length; j++) {
        //           if (arr[j]>arr[i]) {
        //               ar[i]=arr[j];
        //               break;
        //           }
        //       }
        //   }

        Stack<Integer> st=new Stack<Integer>();
        st.push(arr[arr.length-1]);

        for (int i=arr.length-2; i>=0; i--) {

            while (st.size()>0 && st.peek()<arr[i]) {
                st.pop();
            }

            if (st.size()==0) {
                ar[i]=-1;
            } else {
                ar[i]=st.peek();
            }

            st.push(arr[i]);

        }

        return ar;
    }

}