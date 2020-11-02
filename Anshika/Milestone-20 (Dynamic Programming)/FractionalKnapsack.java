//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/fractional-knapsack-official/ojquestion

import java.io.*;
import java.util.*;

public class FractionalKnapsack {

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

        System.out.println (capacity(v,w,cap,0,0));
    }
    
    static double capacity (int[] v, int[] w,int cap, int i, double value) {
        if (cap==0) {
            return value;
        } else if (cap<0 || i==v.length) {
            return 0;
        }  else {
            double x=capacity (v,w,cap-w[i],i+1,value+v[i]);
            double y=capacity (v,w,cap,i+1,value);
            double z=0,zz;
            for (int j=1; j<=w[i]; j++) {
                zz=capacity (v,w,cap-j,i+1,value+(double)v[i]/w[i]*j);
                if (zz>z) {
                    z=zz;
                }
            }
            
            return Math.max(x,Math.max(y,z));
        }
    }
}