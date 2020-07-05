//Write a program to print first 50 natural numbers using recursion.

import java.io.*;
class recursion1
{

    void display (int n)
    {
        if (n>50)
            return;
        else
        {
            System.out.println (n);
            display (n+1);
        }
    }

    public static void main ()
    {
        recursion1 r=new recursion1();
        r.display(1);
    }
}