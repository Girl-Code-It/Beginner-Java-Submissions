//https://www.pepcoding.com/resources/online-java-foundation/recursion-in-arrays/display-array-in-reverse/ojquestion#

import java.io.*;
import java.util.*;

public class DisplayArrayInReverse {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        
        for (int i=0; i<n; i++) {
            ar[i]=sc.nextInt();
        }
        
        displayArrReverse (ar,0);
    }

    public static void displayArrReverse(int[] arr, int idx) {
        if (idx==arr.length) {
            return;
        } else {
            
            displayArrReverse(arr,idx+1);
            System.out.println (arr[idx]);
        }
    }

}