//https://practice.geeksforgeeks.org/problems/gf-series/0

import java.util.*;
import java.lang.*;
import java.io.*;

class GF_Series
{
    public static void main (String[] args) {
        //code
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while (t>0)
        {
            int n=sc.nextInt();
            long i=0, j=1, sum;
            if (n==1)
                System.out.print ("0 ");
            else
                System.out.print ("0 1 ");
            for (int k=3; k<=n; k++)
            {
                sum=i*i-j;
                System.out.print (sum+" ");
                i=j;
                j=sum;
            }
            System.out.println ();

            t--;
        }
    }

    static long func (long n)
    {
        if (n==1)
            return 0;
        else if (n==2)
            return 1;
        else
            return (long)Math.pow (func(n-2),2)-func(n-1);
    }
}