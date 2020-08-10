//Write a program to Print Fibonacci Series using recursion

import java.io.*;
class recursion3
{

    static int fibonacci (int n)
    {
        if (n==0)
            return 0;
        else if (n==1)
            return 1;
        else
            return fibonacci (n-1) + fibonacci (n-2);
    }

    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter no. of terms of series");
        int n=Integer.parseInt (br.readLine());
        
        System.out.println ("The series is : ");
        for (int i=0; i<n; i++)
        {
            System.out.print (fibonacci(i)+" ");
        }
    }
}
