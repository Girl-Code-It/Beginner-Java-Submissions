//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/target-sum-subsets-dp-official/ojquestion

import java.io.*;
import java.util.*;

public class TargetSumSubsets {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        
        for (int i=0; i<n; i++) {
            ar[i]=sc.nextInt();
        }
        
        int target=sc.nextInt();
        System.out.println (subsetSum (ar,0,0,target));
    }
    
    static boolean subsetSum (int[] ar, int i, int sum, int target) {
        if (sum==target) {
            return true;
        } else if (sum>target) {
            return false;
        } else if (i==ar.length) {
            return false;
        } else {
            if (subsetSum(ar,i+1,sum+ar[i],target)) {
                return true;
            }
            if (subsetSum(ar,i+1,sum,target)) {
                return true;
            }
            return false;
        }
    }
}