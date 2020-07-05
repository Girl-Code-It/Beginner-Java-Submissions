//Write a program to reverse a string using recursion


import java.io.*;
class recursion9_version2
{

    static String reverse (String s, int l)
    {
        if (l==s.length())
            return "";
        else
            return reverse (s,l+1) + s.charAt(l);
    }

    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter a string");
        String s=br.readLine();

        String n= reverse (s,0);
        System.out.println ("Reverse string is : "+n);
    }
}