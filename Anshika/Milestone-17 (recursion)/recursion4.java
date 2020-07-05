// Write a program to print the array elements using recursion.

import java.io.*;
class recursion4
{

    static void display (int[] ar, int i)
    {
        if (i==ar.length)
            return;
        else
        {
            System.out.print (ar[i]+" ");
            display (ar,i+1);
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

        display (ar,0);
    }
}
