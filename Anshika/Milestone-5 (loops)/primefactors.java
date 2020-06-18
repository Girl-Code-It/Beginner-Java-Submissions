//Write a program to find all prime factors of a number.

import java.io.*;
class primefactors
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter a no.");
        int n=Integer.parseInt (br.readLine());

        boolean flag=false;

        for (int i=2; i<=n/2; i++)
        {
            flag=false;

            if (n%i==0)
            {
                for (int j=2; j<=i/2; j++)
                {
                    if (i%j==0)
                    {
                        flag=true;
                        break;
                    }
                }
                if (flag==false)
                    System.out.println (i);
            }
        }
    }
}