/*
 * https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/sherlock-and-numbers/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class SherlockAndNumbers
 {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int t=sc.nextInt();
        while (t>0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int p=sc.nextInt();

            int ar[]=new int[k];
            for (int i=0; i<k; i++)
            {
                ar[i]=sc.nextInt();
            }

            if (n-k<p)
            System.out.println ("-1");
            else
            {
            int cnt=0;

            for (int i=0; i<k; i++)
            {
                if (ar[i]<=p)
                {
                    p++;
                }
            }

            if (p>n)
            System.out.println ("-1");
            else
            System.out.println (p);
            }
                
            t--;
        }
    }
}
