//https://www.pepcoding.com/resources/online-java-foundation/recursion-in-arrays/display-array-official/ojquestion#

import java.io.*;
import java.util.*;

public class DisplayArray {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        
        for (int i=0; i<n; i++) {
            ar[i]=sc.nextInt();
        }
        
        displayArr (ar,0);
    }

    public static void displayArr(int[] arr, int idx){
        if (idx==arr.length) {
            return;
        } else {
            System.out.println (arr[idx]);
            displayArr(arr,idx+1);
        }
    }

}