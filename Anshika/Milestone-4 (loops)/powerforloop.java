//Write a program to find power of a number using for loop.

import java.io.*;
class powerforloop
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter no. and exponent");
        int n=Integer.parseInt (br.readLine());
        int e=Integer.parseInt (br.readLine());

        int pow=1;

        for (int i=1; i<=e; i++)
        {
            pow=pow*n;
        }

        System.out.println ("answer is "+pow);
    }
}