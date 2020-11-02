//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/tiling1-official/ojquestion

import java.io.*;
import java.util.*;

public class TilingOne {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        
        int[] ar=new int[n+1];
        ar[0]=1;
        
        int cnt=tiling (n,ar,n);
        System.out.println (cnt);
    }
    
    static int tiling (int n, int[] ar, int i) {
        if (n==0) {
            return 1;
        } else if (n<0) {
            return 0; 
        } else if (ar[n]!=0) {
            return ar[n];
        } else {
            ar[n]= tiling (n-1,ar,i-1) + tiling (n-2,ar,i-2);
            return ar[n];
        }
    }
}