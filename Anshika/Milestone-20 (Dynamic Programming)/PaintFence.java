//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/paint-fence-official/ojquestion

import java.io.*;
import java.util.*;

public class PaintFence {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        
        int[] dp1=new int[n+1];
        int[] dp2=new int[n+1];
        
        dp1[2]=k;
        dp2[2]=k*(k-1);
        
        for (int i=3; i<=n; i++) {
            dp1[i]=dp2[i-1];
            dp2[i]=(dp1[i-1]+dp2[i-1])*(k-1);
        }
        
        System.out.println (dp1[n]+dp2[n]);
    }
}