/*
 * https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/square-transaction-20/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class SquareTransaction {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        int ar[]=new int[t];
        for (int i=0; i<t; i++)
        {
            ar[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        for (int i=1; i<=q; i++)
        {
            int qr=sc.nextInt();
            int sum=0;
            boolean flag=false;
            for (int j=0; j<t; j++)
            {
                sum=sum+ar[j];
                if (sum>=qr)
                {
                    flag=true;
                    System.out.println (j+1);
                    break;
                }
            }
            if (flag==false)
            System.out.println ("-1");
        }
    }
}
