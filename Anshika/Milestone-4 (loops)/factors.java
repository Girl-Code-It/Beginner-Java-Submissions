//Write a program to find all factors of a number.

import java.io.*;
class factors
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter a no.");
        int n=Integer.parseInt (br.readLine());

        for (int i=1; i<=n/2; i++)
        {

            if (n%i==0)
            {
                System.out.println (i);
            }
        }
    }
}