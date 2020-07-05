//Write a program to calculate the sum of numbers from 1 to n using recursion

import java.io.*;
class recursion2
{

    static int sum_of_n (int n)
    {
        if (n==1)
            return 1;
        else
            return n+sum_of_n (n-1);
    }

    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter value of n");
        int n=Integer.parseInt(br.readLine());

        int sum=sum_of_n (n);
        System.out.println ("sum = "+sum);
    }
}