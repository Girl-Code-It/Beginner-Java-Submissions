//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/buy-and-sell-stocks-ita-official/ojquestion

import java.io.*;
import java.util.*;

public class BuyAndSellStockITA {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        
        int[] ar=new int[n];
        for (int i=0; i<n; i++) {
            ar[i]=sc.nextInt();
        }
        
        char[] ch=new char[n];
        ch[0]='-';
        
        for (int i=1; i<n; i++) {
            if (ar[i]<ar[i-1]) {
                ch[i]='f';
            } else {
                ch[i]='r';
            }
        }
        
        int min=0, max=0, profit=0;
        if (ch[1]=='r') {
            min=ar[0];
        }
        for (int i=1; i<n-1; i++) {
            if (ch[i]=='r' && ch[i+1]=='f') {
                max=ar[i];
                profit=profit+(max-min);
            } else if (ch[i]=='f' && ch[i+1]=='r') {
                min=ar[i];
            }
        }
        if (ch[n-1]=='r') {
            max=ar[n-1];
            profit=profit+(max-min);
        }
        
        
        System.out.println (profit);
    }

}