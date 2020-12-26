//https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/lah-official/ojquestion

import java.io.*;
import java.util.*;

public class LargestAreaHistogram{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] ar = new int[n];
        for(int i = 0; i < n; i++){
            ar[i] = Integer.parseInt(br.readLine());
        }

        int[] rsd=new int[n];
        // for (int i=0; i<n; i++) {
        //     int j=i+1;
        //     while (j<n && ar[j]>=ar[i]) {
        //         j++;
        //     }
        //     rsd[i]=j-1;
        // }

        Stack<Integer> st1=new Stack<Integer>();

        for (int i=n-1; i>=0; i--) {
            while (st1.size()>0 && ar[st1.peek()]>=ar[i]) {
                st1.pop();
            }
            if (st1.size()==0) {
                rsd[i]=n-1-i;
            } else {
                rsd[i]=st1.peek()-i-1;
            }
            st1.push(i);
        }

        int[] lsd=new int[n];
        // for (int i=0; i<n; i++) {
        //     int j=i-1;
        //     while (j>=0 && ar[j]>=ar[i]) {
        //         j--;
        //     }
        //     lsd[i]=j+1;
        // }

        Stack<Integer> st2=new Stack<Integer>();

        for (int i=0; i<n; i++) {
            while (st2.size()>0 && ar[st2.peek()]>=ar[i]) {
                st2.pop();
            }
            if (st2.size()==0) {
                lsd[i]=i;
            } else {
                lsd[i]=i-1-st2.peek();
            }
            st2.push(i);
        }

        int max=0, area, width;

        for (int i=0; i<n; i++) {
            width=rsd[i]+lsd[i]+1;
            area=width*ar[i];

            max=Math.max(area,max);
        }

        System.out.println (max);

        // code
    }
}