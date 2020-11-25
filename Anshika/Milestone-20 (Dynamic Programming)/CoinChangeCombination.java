//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/coin-change-combination-official/ojquestion

import java.io.*;
import java.util.*;

public class CoinChangeCombination {

    public static void main(String[] args) throws Exception {
        
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        
        int[] ar=new int[n];
        for (int i=0; i<n; i++) {
            ar[i]=sc.nextInt();
        }
        Arrays.sort(ar);
        
        int amt=sc.nextInt();
        int[] br=new int[amt+1];
        
        br[0]=1;
        for (int i=0; i<n; i++) {
            for (int j=ar[i]; j<br.length; j++) {
                br[j]+=br[j-ar[i]];
            }
        }
        
        System.out.println (br[amt]);

    }

}