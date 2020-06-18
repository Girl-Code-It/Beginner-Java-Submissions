//Write a program to print all Strong numbers between 1 to n.

import java.io.*;
class strongnum100
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);
        int temp, d, sum=0, f=1;
        for (int i=1; i<=1000; i++)
        {
            sum=0;
            temp=i;
            
            while(temp!=0)
            {
                d=temp%10;
                temp=temp/10;
                f=1;
                for (int j=1; j<=d; j++)
                {
                    f=f*j;
                }
                sum=sum+f;
            }
            if (sum==i)
                System.out.println (i);
        }
    }
}