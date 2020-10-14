//https://www.pepcoding.com/resources/online-java-foundation/recursion-backtracking/target-sum-subsets-official/ojquestion#

import java.io.*;
import java.util.*;

public class TargetSumSubset {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for (int i=0; i<n; i++) {
            ar[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        
        printTargetSumSubsets (ar,0,"",0,tar);
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int i, String set, int sum, int tar) {
         if (i==arr.length) {
            if (sum==tar) {
               System.out.println (set+".");
            }
            return;
        } else if (sum>tar) {
            return;
        } else {
            String s=Integer.toString(arr[i]);
            printTargetSumSubsets (arr,i+1,set+s+", ",sum+arr[i],tar);
            printTargetSumSubsets (arr,i+1,set,sum,tar);
        }
    }

}