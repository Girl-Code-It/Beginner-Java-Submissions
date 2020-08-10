//Write a program to reverse a string using recursion


import java.io.*;
class recursion9
{

    static String reverse (String s, int l)
    {
        if (l==-1)
            return "";
        else
            return s.charAt(l) + reverse (s,l-1);
    }

    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter a string");
        String s=br.readLine();

        String n= reverse (s,s.length()-1);
        System.out.println ("Reverse string is : "+n);
    }
}
