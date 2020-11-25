//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/tiling2-official/ojquestion

import java.io.*;
import java.util.*;

public class TilingTwo {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        int cnt=tiling (n,m,n);
        System.out.println (cnt);
    }
    
    static int tiling (int n, int m, int i) {
        if (n==0) {
            return 1;
        } else if (n<0) {
            return 0;
        } else {
            return tiling (n-1,m,i-1) + tiling (n-m,m,i-m);
        }
    }
}