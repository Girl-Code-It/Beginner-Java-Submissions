/*
Write a program to shift every element of an array to circularly right. E.g.-
INPUT : 1 2 3 4 5
OUTPUT : 5 1 2 3 4*/
import java.io.*;
class array32
{
    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter value of n");
        int n=Integer.parseInt (br.readLine());

        int ar[]=new int[n];

        System.out.println ("Enter elements");
        for (int i=0; i<n; i++)
        {
            ar[i]=Integer.parseInt (br.readLine());
        }

        int temp;

        for (int i=n-1; i>0; i--)
        {
            temp=ar[i];
            ar[i]=ar[i-1];
            ar[i-1]=temp;
        }

        for (int i=0; i<n; i++)
        {
            System.out.print (ar[i]);
        }
    }
}