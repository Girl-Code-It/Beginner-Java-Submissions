/*
 *https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/discover-the-monk/ 
 */

import java.util.*;
import java.util.Arrays;

class DiscoverTheMonk
 {
    public static void main(String args[] ) throws Exception {
     
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int ar[]=new int[n];
        for (int i=0; i<n; i++)
        {
            ar[i]=sc.nextInt();
        }
        Arrays.sort(ar);
        while (q>0)
        {
            int qr=sc.nextInt();
            q--;

            if (binary(ar,qr,0,ar.length-1))
            System.out.println ("YES");
            else
            System.out.println ("NO");
        }

    }
    static boolean binary (int[] a, int q, int min, int max)
    {
           int mid=(min+max)/2;
            if (min>max)
            return false;

            else if (a[mid]==q)
            {
                return true;
            }
            else if (a[mid]<q)
            {
                return binary (a,q,mid+1,max);
            }
            else
            {
                return binary (a,q,min,mid-1);
            }
        

    }
}
   

