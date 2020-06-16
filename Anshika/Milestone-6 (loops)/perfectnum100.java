//Write a program to print all Perfect numbers between 1 to n.

import java.io.*;
class perfectnum100
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        int temp, sum;

        for (int i=1; i<=100; i++)
        {
            temp=i;
            sum=0;

            for (int j=1; j<=temp/2; j++)
            {
                if (temp%j==0)
                    sum=sum+j;
            }
            
            if (sum==i)
            System.out.println (i);
        }
    }
}