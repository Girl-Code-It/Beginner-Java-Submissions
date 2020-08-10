// Write a program to find the Factorial of a number using recursion

import java.io.*;
class recursion10
{

    static int factorial (int n)
    {
        if (n==1)
            return 1;
        else
            return n* factorial (n-1);
    }

    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter value of N");
        int n=Integer.parseInt (br.readLine());

        int fact= factorial (n);
        System.out.println ("factorial of "+n+" is : "+fact);
    }
}
