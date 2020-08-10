//Write a program to Check whether a given String is Palindrome or not

import java.io.*;
class recursion16
{

    static boolean palindrome (String s, int l)
    {
        if (l==s.length()/2)
            return true;
        else if (s.charAt(l-1)!=s.charAt(s.length()-l))
            return false;
        else
            return palindrome (s,l-1);
    }

    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter a string");
        String s=br.readLine();

        if (palindrome(s,s.length()))
            System.out.println ("String is palindrome");
        else
            System.out.println ("String is not palindrome");
    }
}
