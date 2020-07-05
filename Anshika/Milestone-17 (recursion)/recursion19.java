//Write a program to copy One string to another using recursion

import java.io.*;
class recursion19
{

    static String copyString (String s, int l)
    {
        if (l==s.length())
            return "";
        else
            return s.charAt(l) + copyString (s,l+1);
    }

    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter a string");
        String s=br.readLine();

        String n= copyString (s,0);
        System.out.println ("The first string is : "+s+"\nThe second string is : "+n);
    }
}
