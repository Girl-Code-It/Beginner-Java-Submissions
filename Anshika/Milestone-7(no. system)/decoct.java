// Write a program to convert a decimal no. to octal no.

import java.io.*;
class decoct
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter the decimal no.");
        int dec=Integer.parseInt (br.readLine());

        int o[]=new int[8];
        int rem, i=0;

        while (dec!=0)
        {
            rem=dec%8;
            o[i++]=rem;
            dec=dec/8;
        }
        i-=1;
        System.out.println ("Octal no. -");
        while (i>=0)
        {
            System.out.print (o[i--]);
        }
    }
}