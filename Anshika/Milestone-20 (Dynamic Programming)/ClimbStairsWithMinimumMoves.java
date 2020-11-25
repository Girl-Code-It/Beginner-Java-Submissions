//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/climb-stairs-with-minimum-moves-official/ojquestion

import java.io.*;
import java.util.*;

public class ClimbStairsWithMinimumMoves {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for (int i=0; i<n; i++) {
            ar[i]=sc.nextInt();
        }
        Integer[] steps=new Integer[n+1];
        steps[n]=0;
        
        Integer cnt=stairPath(0,n,ar,steps);
        System.out.println (cnt);
    }
    
    static Integer stairPath (int i, int n, int[] ar, Integer[] br) {
        if (i==n) {
            return 0;
        } else if (i>n) {
            return null;
        } else if (br[i]!=null) {
            return br[i];
        } else {
            Integer x=br[i], y;
            for (int j=1; j<=ar[i]; j++) {
                y=stairPath (i+j, n, ar, br);
                if (y==null) {
                    continue;
                } else {
                    x=1+y;
                }
                if (br[i]==null || x<br[i]) {
                    br[i]=x;
                }
            }
            return br[i];
        }
    }

}