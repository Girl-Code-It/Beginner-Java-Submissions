//Write a program to get the largest element of an array using recursion

import java.io.*;
class recursion8
{

    static int maximum (int[] ar, int i, int max)
    {
        if (i==ar.length)
            return max;
        else if (ar[i]>max)
            return maximum (ar,i+1,ar[i]);
        else
            return maximum (ar,i+1,max);
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

        int m = maximum (ar,0,ar[0]);
        System.out.println ("the largest element of the array is : "+m);
    }
}
