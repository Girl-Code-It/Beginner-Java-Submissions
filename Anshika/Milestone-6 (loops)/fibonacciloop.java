//Write a program to print Fibonacci series up to n terms.

import java.io.*;
class fibonacciloop
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter value of n");
        int n=Integer.parseInt (br.readLine());

        int i=0, j=1, sum=0;
        System.out.println (i);
        System.out.println (j);

        for (int k=3; k<=n; k++)
        {
            sum=i+j;
            i=j;
            j=sum;
            System.out.println (sum);
        }

    }
}