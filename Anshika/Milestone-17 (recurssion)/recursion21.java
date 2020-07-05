//Write a program for binary search using recursion

import java.io.*;
class recursion21
{

    static boolean binary_search (int[] ar, int min, int max, int n)
    {
        int mid=(min+max)/2;
        if (min>max)
            return false;
        else 
        {
            if (n==ar[mid])
                return true;
            else if (n<ar[mid])
                return binary_search (ar,min,mid-1,n);
            else
                return binary_search (ar,mid+1,max,n);
        }
    }

    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter size of array");
        int n=Integer.parseInt (br.readLine());

        System.out.println ("Enter elements in array");
        int ar[]=new int[n];
        for (int i=0; i<n; i++)
        {
            ar[i]=Integer.parseInt(br.readLine());
        }

        System.out.println ("Enter no. to be searched");
        int x=Integer.parseInt(br.readLine());

        if (binary_search(ar,0,ar.length-1,x))
            System.out.println ("Element found");
        else
            System.out.println ("Element not found");
    }
}
