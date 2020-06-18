/*
Write a program to print absolute vlaue of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1
 */

import java.io.*;
class absolute
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter a no.");
        int n=Integer.parseInt (br.readLine());

        if (n<0)
            System.out.println ("Absolute value is "+(-1*n));
        else
            System.out.println ("Absolute value is "+n);
    }
}