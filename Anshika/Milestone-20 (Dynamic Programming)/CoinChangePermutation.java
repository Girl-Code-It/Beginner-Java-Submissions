//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/coin-change-permutations-official/ojquestion

import java.io.*;
import java.util.*;

public class CoinChangePermutation {

    public static void main(String[] args) throws Exception {
        
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        
        int[] ar=new int[n];
        for (int i=0; i<n; i++) {
            ar[i]=sc.nextInt();
        }
        
        int amt=sc.nextInt();
        int[] br=new int[amt+1];
        
        br[0]=1;
        for (int i=1; i<=amt; i++) {
            for (int j=0; j<ar.length; j++) {
                if (ar[j]<=i) {
                   br[i]+=br[i-ar[j]];                    
                }
            }
        }
        
        System.out.println (br[amt]);

    }

}