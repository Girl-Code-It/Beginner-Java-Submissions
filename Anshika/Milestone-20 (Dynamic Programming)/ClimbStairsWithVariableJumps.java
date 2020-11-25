//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/climb-stairs-with-variable-jumps-official/ojquestion

import java.io.*;
import java.util.*;

public class ClimbStairsWithVariableJumps {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        
        int[] ar=new int[n];
        for (int i=0; i<n; i++) {
            ar[i]=sc.nextInt();
        }
        int[] steps=new int[n];
        
        int cnt=stairPath(0,n,ar,steps);
        System.out.println (cnt);
    }
    
    static int stairPath (int i, int n, int[] ar, int[] br) {
        if (i==n) {
            return 1;
        } else if (i>n) {
            return 0;
        } else if (br[i]!=0) {
            return br[i];
        } else {
            for (int j=1; j<=ar[i]; j++) {
                br[i]=br[i]+stairPath (i+j, n, ar, br);
            }
            return br[i];
        }
    }

}