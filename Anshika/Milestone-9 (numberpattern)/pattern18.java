/*
5 5 5 5 5 5 5 5 5
5 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 3 3 3 3 4 5
5 4 4 4 4 4 4 4 5
5 5 5 5 5 5 5 5 5
*/


import java.io.*;
class pattern18
{
    public static void main ()
    {
        for (int i=1; i<=9; i++)
        {
            for (int j=1; j<=9; j++)
            {
                if (i<=5)
System.out.print (5-i+1);
else 
System.out.print (i-5+1);
            }
            System.out.println ();
        }

    }
}