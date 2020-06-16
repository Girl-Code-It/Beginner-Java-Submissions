/*Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).
 */

import java.io.*;
class loworup
{
    public static void main (String args []) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter a character");
        char c=(char)br.read();

        int ch=(int)c;

        if (ch>=65 && ch<=90)
            System.out.println ("upper case");
        else if (ch>=97 && ch<=122)
            System.out.println ("lower case");
        else
            System.out.println ("invalid choice");
    }
}