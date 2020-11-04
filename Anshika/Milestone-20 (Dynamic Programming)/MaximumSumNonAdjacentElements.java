//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/maximum-sum-non-adjacent-elements-official/ojquestion

import java.io.*;
import java.util.*;

public class MaximumSumNonAdjacentElements {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        
        for (int i=0; i<n; i++) {
            ar[i]=sc.nextInt();
        }
        
        int[] dp1=new int[n];
        int[] dp2=new int[n];
        
        dp1[0]=ar[0];
        dp2[0]=0;
        
        for (int i=1; i<n; i++) {
            dp1[i]=dp2[i-1]+ar[i];
            dp2[i]=Math.max(dp1[i-1],dp2[i-1]);
        }

        System.out.println (Math.max(dp1[n-1],dp2[n-1]));
    }

}