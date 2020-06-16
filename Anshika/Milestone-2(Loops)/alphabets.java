//Write a program to print all alphabets from a to z. - using while loop

import java.io.*;
class alphabets
{
    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        int ch=65;

        while (ch<=90)
        {
            System.out.println ((char)ch);
            ch++;
        }

    }
}