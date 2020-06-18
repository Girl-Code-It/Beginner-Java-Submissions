//Write a program to calculate product of digits of a number.

import java.io.*;
class productdigit
{
    public static void maine () throws IOException
    {
        InputStreamReader in =new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter value of n"); 
        int n=Integer.parseInt (br.readLine());

        int p=1, d, temp=n;

        while (temp!=0)
        {
            d=temp%10;
            p=p*d;
            temp=temp/10;
        }

        System.out.println ("product of digits is "+p);
    }
}