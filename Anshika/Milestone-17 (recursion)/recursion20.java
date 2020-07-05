//Write a program to find the first capital letter in a string using recursion

import java.io.*;
class recursion20
{

    static char upper_case (String s, int l)
    {
        if (l==s.length())
            return s.charAt(l-1);
        else if (Character.isUpperCase(s.charAt(l)))
            return s.charAt(l);
        else
            return upper_case (s,l+1);
    }

    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter a string including atleast one capital letter");
        String s=br.readLine();

        char ch=upper_case (s,0);
        System.out.println ("The first capital letter appears in the string "+s+" is "+ch);
    }
}
