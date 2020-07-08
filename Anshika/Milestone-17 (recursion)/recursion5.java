//Write a program to count the digits of a given number using recursion

import java.io.*;
class recursion5
{

    static int no_of_Digits (int n)
    {
        if (n==0)
            return 0;
        else
        return 1 + no_of_Digits (n/10);
    }

    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter value of N");
        int n=Integer.parseInt (br.readLine());

        int d= no_of_Digits (n);
        System.out.println ("The number of digits in "+n+" is : "+d);
    }
}
