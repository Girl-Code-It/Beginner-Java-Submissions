//Write a program to find sum of all prime numbers between 1 to n.

import java.io.*;
class sumprime
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        boolean flag;
        int sum=0;
        
        for (int i=1; i<=100; i++)
        {
            flag=false;

            for (int j=2; j<=i/2; j++)
            {
                if (i%j==0)
                {
                    flag=true;
                    break;
                }
            }
            if (flag==false)
            {
                System.out.println (i);
                sum=sum+i;
            }
        }
        
        System.out.println ("sum is "+sum);
    }
}