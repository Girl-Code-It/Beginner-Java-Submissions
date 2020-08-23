//https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/min-max-difference/

import java.util.*;

class Easy_Going {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while (t>0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int ar[]=new int[n];

            for (int i=0; i<n; i++)
            {
                ar[i]=sc.nextInt();
            }

            int temp;
            for (int i=0; i<n; i++)
            {
                for (int j=0; j<n-1-i; j++)
                {
                    if (ar[j]>ar[j+1])
                    {
                        temp=ar[j+1];
                        ar[j+1]=ar[j];
                        ar[j]=temp;
                    }
                }
            }

            int x=n-m;
            long max=0, min=0;

            for (int i=0; i<x; i++)
            {
                min=min+ar[i];
            }
            for (int i=n-1; i>=m; i--)
            {
                max=max+ar[i];
            }

            long dif=Math.abs(max-min);
            System.out.println (dif);

            t--;
        }

    }
}
