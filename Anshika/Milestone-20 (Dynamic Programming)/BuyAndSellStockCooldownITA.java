//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/buy-and-sell-stocks-cooldown-ita-official/ojquestion

import java.io.*;
import java.util.*;

public class BuyAndSellStockCooldownITA {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        
        int[] price=new int[n];
        for (int i=0; i<n; i++) {
            price[i]=sc.nextInt();
        }
        
        int[] dp1=new int[n];
        int[] dp2=new int[n];
        int[] dp3=new int[n];
        
        dp1[0]=-price[0];
        
        for (int i=1; i<n; i++) {
            dp1[i]=Math.max(dp1[i-1],dp3[i-1]-price[i]);
            dp2[i]=Math.max(dp2[i-1],price[i]+dp1[i-1]);
            dp3[i]=Math.max(dp3[i-1],dp2[i-1]);
        }
        
        System.out.println (dp2[n-1]);
    }

}