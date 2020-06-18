/*
 * https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/repeated-k-times/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.Arrays;
import java.util.*;


class RepeatedKTimes {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt ();
        int ar[]=new int[n];

        for (int i=0; i<n; i++)
        {
            ar[i]=sc.nextInt();
        }
        int k=sc.nextInt();

        Arrays.sort(ar);

        int store=ar[0];
        int cnt=0;
        for (int i=0; i<n; i++)
        {
            if (store==ar[i])
            cnt++;
            else
            {
                if (cnt==k)
                {   
                    break;
                }
                store=ar[i];
                cnt=1;
            }
        }
        System.out.println (store);
        
    }
}
