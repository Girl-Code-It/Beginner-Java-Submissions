// Write a program to convert a hexadecimal no. to binary no.

import java.io.*;
class hexdec
{
    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter a hexadecimal no.");
        String hex=br.readLine();

        int l=hex.length();
        char c[]=new char[l];
        for (int i=0; i<l; i++)
        {
            c[i]=hex.charAt(l-1-i);
        }

        double dec=0, chh;
        char ch;

        for (int i=0; i<l; i++)
        {
            ch=c[i];
            chh=(double)ch;

            if (chh>=48 && chh<=57)
            {
                dec=dec+Math.pow(16,i)*(chh-48);
            }

            else
            {
                dec=dec+Math.pow(16,i)*(chh-55);
            }
        }

        System.out.println ("Decimal no. - "+(int)dec);

    }
}