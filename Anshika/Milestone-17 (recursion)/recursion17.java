// Write a program to calculate the power of any number using recursion

import java.io.*;
class recursion17
{

    static int power (int n, int k)
    {
        if (k==1)
            return n;
        else
            return n * power (n,k-1);
    }

    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter value of n and k upto which n is to be raised");
        int n=Integer.parseInt (br.readLine());
        int k=Integer.parseInt (br.readLine());

        int p= power (n,k);
        System.out.println ("the value of "+n+" to the power "+k+" is - "+p);
    }
}