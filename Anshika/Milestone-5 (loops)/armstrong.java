//Write a program to check whether a number is Armstrong number or not.

import java.io.*;
class armstrong
{
    public static void maine () throws IOException
    {
        InputStreamReader in =new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter value of n"); 
        int n=Integer.parseInt (br.readLine());

        int sum=0, d, temp=n;

        while (temp!=0)
        {
            d=temp%10;
            sum=sum+d*d*d;
            temp=temp/10;
        }
        if (sum==n)
            System.out.println ("armstrong no.");
        else
            System.out.println ("not an armstrong no.");
    }
}