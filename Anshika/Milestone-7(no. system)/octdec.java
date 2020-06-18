//Write a program to convert octal no. to decimal no.

import java.io.*;
class octdec
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter an octal no.");
        String o=br.readLine();

        int l=o.length() , dec=0;
        int x=0;
        char ch;
        
        for (int i=l-1; i>=0; i--)
        {
            ch=o.charAt(i);
            dec=dec+(int)Math.pow(8,x)*((int)ch-48);
            x++;
        }

        System.out.println ("Decimal no. - "+dec);
    }
}