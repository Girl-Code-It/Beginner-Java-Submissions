/*
11111
10001
10001
10001
11111
 */

import java.io.*;
class pattern4
{
    public static void main ()
    {
        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=5; j++)
            {
                if (i==1 || i==5 || j==1 || j==5)
                System.out.print ("1");
                else
                System.out.print ("0");
            }
            System.out.println ();
        }

    }
}