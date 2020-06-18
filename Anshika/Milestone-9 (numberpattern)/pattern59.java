/*
1       1
 2     2
  3   3
   4 4
    5
   4 4
  3   3
 2     2
1       1
*/

import java.io.*;
class pattern59
{
    public static void main ()
    {
        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=9; j++)
            {
                if (i==j || i+j==10)
                    System.out.print (i);
                else 
                    System.out.print (" ");
            }
            System.out.println ();
        }

        for (int i=4; i>=1; i--)
        {
            for (int j=1; j<=9; j++)
            {
                if (i+j==10 || j==i)
                    System.out.print (i);
                else
                    System.out.print (" ");
            }
            System.out.println ();
        }
    }
}