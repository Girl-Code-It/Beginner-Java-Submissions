//Write a program to enter a number and print its reverse.

import java.io.*;
class revnum
{
    public static void  main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter a no.");
        int n=Integer.parseInt (br.readLine());

        int d, rev=0;

        while (n!=0)
        {
            d=n%10;
            n=n/10;
            rev=rev*10+d;
        } 

        System.out.println ("Reverse of no. - "+rev);
    }
}