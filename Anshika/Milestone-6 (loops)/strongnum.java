//Write program to check whether a number is Strong number or not.

import java.io.*;
class strongnum
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter a no.");
        int n=Integer.parseInt (br.readLine());

        int temp=n, d, sum=0, f=1;

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
        if (sum==n)
            System.out.println ("strong no.");
        else
            System.out.println ("not a strong no.");
    }
}