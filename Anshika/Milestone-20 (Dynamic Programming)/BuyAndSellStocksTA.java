//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/buy-sell-stocks-tta-official/ojquestion

import java.io.*;
import java.util.*;

public class BuyAndSellStocksTA {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        
        int[] price=new int[n];
        for (int i=0; i<n; i++) {
            price[i]=sc.nextInt();
        }
        
        int[] pro=new int[n];
        int profit=0, pro1=0, min=price[0], max=0;
        
        pro[0]=0;
        for (int i=1; i<n; i++) {
            
            for (int j=i; j>=0; j--) {
                if (price[j]<min) {
                    min=price[j];
                }
            }
            
            pro1=Math.max(pro1,price[i]-min);
            pro[i]=pro1;
        }
        
        pro1=0;
        pro[n-1]=pro1;
        for (int i=n-2; i>=0; i--) {
            
            for (int j=i; j<n; j++) {
                if (price[j]>max) {
                    max=price[j];
                }
            }
            
            pro1=Math.max(pro1,max-price[i]);
            pro[i]=pro1+pro[i];
        }
        
        Arrays.sort(pro);
        
        System.out.println (pro[n-1]);
    }

}