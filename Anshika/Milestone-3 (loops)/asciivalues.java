//Write a program to print all ASCII character with their values.

import java.io.*;
class asciivalues
{
    public static void main ()
    {
        for (int i=0; i<=225; i++)
        {
            System.out.println ("ASCII value of character "+((char)i)+" = "+i);
        }
    }
}