//Write a program to find the sum of digits of a number using recursion.

import java.io.*;
class recursion6
{

    static int sum_of_Digits (int n)
    {
        if (n==0)
            return 0;
        else
        {
            return n%10 + sum_of_Digits (n/10);
        }
    }

    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter value of N");
        int n=Integer.parseInt (br.readLine());

        int sum=sum_of_Digits (n);
        System.out.println ("The sum of digits of "+n+" is : "+sum);
    }
}
