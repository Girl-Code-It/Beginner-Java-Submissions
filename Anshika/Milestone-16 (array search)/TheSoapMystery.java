/*
 * https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/the-soap-mystery/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
import java.util.Arrays;

class TheSoapMystery
 {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();

        int ar[]=new int[n];
        for (int i=0; i<n; i++)
        {
            ar[i]=sc.nextInt();
        }

        int q=sc.nextInt();
        Arrays.sort(ar);

        while (q>0)
        {
            int qr=sc.nextInt();
            int cnt=lowerBound (ar, qr);
            if (cnt==-1)
            cnt=n;
            System.out.println (cnt);

            q--;
        }
    }
    static int lowerBound (int[] ar, int qr)
    {
        int min=0, mid, max=ar.length-1;
        while (true)
        {
            mid=(min+max)/2;
            if (ar[mid]==qr || ar[mid]>qr)
            {
                max=mid-1;
                if (max<min)
                return mid;
            }
            else
            {
                min=mid+1;
                if (max<min)
                return mid<ar.length-1?mid+1:-1;
            }
        }
    }
}
