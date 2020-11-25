//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/buy-and-sell-stocks-kta---official/ojquestion

import java.io.*;
import java.util.*;

public class BuyAndSellStockKTA {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        
        int[] price=new int[n];
        for (int i=0; i<n; i++) {
            price[i]=sc.nextInt();
        }
        
        int k=sc.nextInt();
        
        int[][] dp=new int[k+1][n];
        int max=0, profit;
        
        for (int i=1; i<=k; i++) {
            
            for (int j=1; j<n; j++) {
                
                max=dp[i][j-1];
                
                for (int x=j; x>=0; x--) {
                    
                    profit=price[j]-price[x];
                    profit+=dp[i-1][x];
                    if (profit>max) {
                        max=profit;
                    }
                }
                
                dp[i][j]=max;
            }
        }
        
        System.out.println (dp[k][n-1]);
    }

}



