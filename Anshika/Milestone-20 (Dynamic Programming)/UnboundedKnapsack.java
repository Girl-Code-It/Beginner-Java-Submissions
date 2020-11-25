//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/unbounded-knapsack-official/ojquestion

import java.io.*;
import java.util.*;

public class UnboundedKnapsack {

    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();

        int[] v=new int[n];
        int[] w=new int[n];

        for (int i=0; i<n; i++) {
            v[i]=sc.nextInt();
        } 
        for (int i=0; i<n; i++) {
            w[i]=sc.nextInt();
        }

        int cap=sc.nextInt();
        int[] c=new int[cap+1];

        int max=0,cnt;
        for (int i=0; i<c.length; i++) {
            cnt=capacity (v,w,i,0,0);
            if (cnt>max) {
                max=cnt;
            }
        }
        System.out.println (max);
    }

    static int capacity (int[] v, int[] w,int cap, int i, int value) {
        if (cap==0) {
            return value;
        } else if (cap<0 || i==v.length) {
            return 0;
        }  else {
            int x=capacity (v,w,cap-w[i],i,value+v[i]);
            int y=capacity (v,w,cap,i+1,value);
            return Math.max(x,y);
        }
    }
}