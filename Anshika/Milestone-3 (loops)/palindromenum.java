//Write a program to check whether a number is palindrome or not.

import java.io.*;
class palindromenum
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter 4 digit no.");
        int n=Integer.parseInt (br.readLine());

        int temp=n, d, rev=0;

        while(temp!=0)
        {
            d=temp%10;
            temp=temp/10;
            rev=rev*10+d;
        }
        if (rev==n)
            System.out.println ("palindrome no.");
        else
            System.out.println ("not a palindrome no.");
    }
}