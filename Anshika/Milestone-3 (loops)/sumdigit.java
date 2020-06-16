//Write a program to calculate sum of digits of a number.

import java.io.*;
class sumdigit
{
    public static void maine () throws IOException
    {
        InputStreamReader in =new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter value of n"); 
        int n=Integer.parseInt (br.readLine());

        int d, sum=0, temp=n;

        while (temp!=0)
        {
            d=temp%10;
            sum=sum+d;
            temp=temp/10;

        }

        System.out.println ("sum is "+sum);
    }
}