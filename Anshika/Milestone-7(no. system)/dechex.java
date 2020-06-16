// Write a program to convert a decimal no. to hexadecimal no.

import java.io.*;
class dechex
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter the decimal no.");
        int dec=Integer.parseInt (br.readLine());

        char hex[]=new char[8];
        int rem, i=0;

        while (dec!=0)
        {
           rem=dec%16;
           dec=dec/16;
           
           if (rem<10)
           {
               hex[i++]=(char)(rem+48);
            }
            else
            {
                hex[i++]=(char)(rem+55);
            }
        }

        System.out.println ("Hexadecimal no. -");
        i=i-1;
        while (i>=0)
        {
            System.out.print (hex[i--]);
        }
    }
}