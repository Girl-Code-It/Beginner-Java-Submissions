//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/buy-and-sell-stocks-ota-official/ojquestion

import java.io.*;
import java.util.*;

public class BuyAndSellStocks {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        
        int[] price=new int[n];
        for (int i=0; i<n; i++) {
            price[i]=sc.nextInt();
        }
        
        int profit=0, max=0;
        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                if (price[j]>price[i]) {
                    profit=price[j]-price[i];
                    if (profit > max) {
                        max=profit;
                    }
                }
            }
        }
        
        System.out.println (max);
    }
    

}