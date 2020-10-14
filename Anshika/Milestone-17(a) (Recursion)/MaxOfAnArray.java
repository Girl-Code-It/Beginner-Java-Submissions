//https://www.pepcoding.com/resources/online-java-foundation/recursion-in-arrays/max-of-an-array-official/ojquestion#

import java.io.*;
import java.util.*;

public class MaxOfAnArray {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        
        for (int i=0; i<n; i++) {
            ar[i]=sc.nextInt();
        }
        
        int max=maxOfArray (ar,0,ar[0]);
        System.out.println (max);
    }

    public static int maxOfArray(int[] arr, int i, int max){
        if (i==arr.length) {
            return max;
        } else {
            if (arr[i]>max) {
                max=arr[i];
            }
            return maxOfArray (arr,i+1,max);
        }
    }

}