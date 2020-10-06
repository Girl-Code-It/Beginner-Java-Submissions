//https://www.pepcoding.com/resources/online-java-foundation/recursion-in-arrays/last-index-official/ojquestion#

import java.io.*;
import java.util.*;

public class LastIndex {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        
        for (int i=0; i<n; i++) {
            ar[i]=sc.nextInt();
        }
        
        int x=sc.nextInt();
        
        int i=lastIndex (ar,n-1,x);
        System.out.println (i);
    }

    public static int lastIndex(int[] arr, int idx, int x){
         if (idx==-1) {
            return -1;
        } else if (arr[idx]==x) {
            return idx;
        } else {
            return lastIndex (arr,idx-1,x);
        }
    }

}