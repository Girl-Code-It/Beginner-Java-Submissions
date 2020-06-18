//Write a program to print all Armstrong numbers between 1 to n.

import java.io.*;
class armstrong100
{
    public static void maine () throws IOException
    {
        InputStreamReader in =new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter value of n"); 
        int n=Integer.parseInt (br.readLine());

        int sum=0, d, temp;
        for (int i=1; i<=n; i++)
        {
            temp=i;
            sum=0;
            while (temp!=0)
            {
                d=temp%10;
                sum=sum+d*d*d;
                temp=temp/10;
            }
            if (sum==i)
                System.out.println (i);

        }
    }
}