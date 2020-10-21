//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/climb-stairs-official/ojquestion

import java.io.*;
import java.util.*;

public class ClimbStairs {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] ar=new int[n+1];
        System.out.println (stairPathWays(n,ar));
    }
    
    static int stairPathWays (int n, int[] ar) {
        if (n==0) {
            return 1;
        } else if (n<0) {
            return 0;
        } else if (ar[n]!=0) {
            return ar[n];
        } else {
            return ar[n]=stairPathWays(n-1,ar) +stairPathWays(n-2,ar) +stairPathWays(n-3,ar);
        }
    }

}