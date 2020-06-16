//Write a program to find one's complement of a binary number.

import java.io.*;
class onescomplement
{
    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        int a[]=new int[8];

        System.out.println ("Enter a binary no.");
        for (int i=0; i<8; i++)
        {
            a[i]=Integer.parseInt (br.readLine());
        }

        System.out.println ("binary no. -");
        for (int i=0; i<8; i++)
        {
            System.out.print (a[i]);
        }

        for (int i=0; i<8; i++)
        {
            if (a[i]==0)
                a[i]=1;
            else
                a[i]=0;
        }

        System.out.println ();
        System.out.println ("one's complement -");

        for (int i=0; i<8; i++)
        {
            System.out.print (a[i]);
        }
    }
}