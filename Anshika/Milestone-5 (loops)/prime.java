//Write a program to check whether a number is Prime number or not.

import java.io.*;
class prime
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter a no.");
        int n=Integer.parseInt (br.readLine());

        boolean flag=false;

        for (int i=2; i<=Math.sqrt(n); i++)
        {
            if (n%i==0)
            {
                flag=true;
                break;
            }
        }
        if (flag==false)
            System.out.println ("prime no.");
        else
            System.out.println ("not a prime no.");
    }
}

