// Write a program to convert a decimal no. to binary no.

import java.io.*;
class decbin
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter the decimal no.");
        int dec=Integer.parseInt (br.readLine());

        int b[]=new int[100];
        int rem, i=0;

        while (dec!=0)
        {
            rem=dec%2;
            b[i++]=rem;
            dec=dec/2;
        }

        System.out.println ("Binary no. -");
        for (int x=i-1; x>=0; x--)
        {
            System.out.print (b[x]);
        }
    }
}