// Write a program to convert a binary no. to decimal no.

import java.io.*;
class bindec
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter a binary no.");
        int b[]=new int[8];
        for (int i=0; i<8; i++)
        {
            b[i]=Integer.parseInt (br.readLine());
        }

        int x=0, dec=0;

        for (int i=7; i>=0; i--)
        {
            dec=dec+(int)Math.pow(2,x)*b[i];
            x++;
        }
        System.out.println ("Decimal no. - "+dec);
    }
}