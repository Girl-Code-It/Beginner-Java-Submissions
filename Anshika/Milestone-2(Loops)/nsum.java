//Write a program to find sum of all natural numbers between 1 to n.

import java.io.*;
class nsum
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter vlaue of n");
        int n=Integer.parseInt (br.readLine());

        int sum=0;
        for (int i=1; i<=n; i++)
        {
            sum=sum+i;
        }

        System.out.println ("sum is "+sum);
    }
}