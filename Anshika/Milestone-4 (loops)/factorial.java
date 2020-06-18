//Write a program to calculate factorial of a number.

import java.io.*;
class factorial
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter a no.");
        int n=Integer.parseInt (br.readLine());
        
        int fact=1;
        for (int i=1; i<=n; i++)
        {
            fact=fact*i;
        }
        
        System.out.println ("factorial of no. - "+fact);
    }
}