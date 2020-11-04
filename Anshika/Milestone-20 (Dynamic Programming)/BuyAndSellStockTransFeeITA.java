//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/buy-sell-stocks-transaction-fee-ita-official/ojquestion

import java.io.*;
import java.util.*;

public class BuyAndSellStockTransFeeITA {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        
        int[] ar=new int[n];
        for (int i=0; i<n; i++) {
            ar[i]=sc.nextInt();
        }
        
        int fee=sc.nextInt();
        
        int[] bsp=new int[n];
        int[] ssp=new int[n];
        
        bsp[0]=-ar[0];
        ssp[0]=0;
        
        for (int i=1; i<n; i++) {
            bsp[i]=Math.max(bsp[i-1],ssp[i-1]-ar[i]);
            ssp[i]=Math.max(ssp[i-1],ar[i]+bsp[i-1]-fee);
            // System.out.println (bsp[i]+" "+ssp[i]);
        }
        
        System.out.println (ssp[n-1]);

    }

}