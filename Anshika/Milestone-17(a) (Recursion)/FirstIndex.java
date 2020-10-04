//https://www.pepcoding.com/resources/online-java-foundation/recursion-in-arrays/first-index-official/ojquestion#

import java.io.*;
import java.util.*;

public class FirstIndex {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        
        for (int i=0; i<n; i++) {
            ar[i]=sc.nextInt();
        }
        
        int x=sc.nextInt();
        
        int i=firstIndex (ar,0,x);
        System.out.println (i);
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if (idx==arr.length) {
            return -1;
        } else if (arr[idx]==x) {
            return idx;
        } else {
            return firstIndex (arr,idx+1,x);
        }
    }

}