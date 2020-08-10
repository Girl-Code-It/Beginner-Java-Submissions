// Write a program to check a number is a prime number or not using recursion.

import java.io.*;
class recursion12
{

    static boolean prime (int n, int i)
    {
        if (i>Math.sqrt(n))
        return true;
        else if (n%i==0)
        return false;
        else
        return prime (n,i+1);
    }

    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter the no. to be checked");
        int n=Integer.parseInt (br.readLine());

        if (prime(n,2) && n!=1)
        System.out.println (n+" is a prime no.");
        else
        System.out.println (n+" is not a prime no.");
    }
}
