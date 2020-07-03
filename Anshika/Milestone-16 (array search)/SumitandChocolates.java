/*
 * https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/sumit-and-chocolates/
 */


import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class SumitandChocolates
 {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        int a[]=new int[n];
        int sum=0;
        for (int i=0; i<n; i++)
        {
            ar[i]=sc.nextInt();
            sum=sum+ar[i];
            a[i]=sum;
        }
        
        int qr=sc.nextInt();
        while (qr>0)
        {
            qr--;
            int q=sc.nextInt();
            
            int store=lowerBound (a,q);

            System.out.println (store+1);
        }

    }

    static int lowerBound (int[] a, int q)
    {
        int min=0;
        int max=a.length-1;
        int mid;
        while (true)
        {
            mid=(min+max)/2;
            if (a[mid]==q ||a[mid]>q)
            {
                max=mid-1;
                if (max<min)
                return mid;
            }
            else
            {
                min=mid+1;
                if (min>max)
                return (mid<a.length-1)?mid+1:-1;
            }
        }
    }
}
