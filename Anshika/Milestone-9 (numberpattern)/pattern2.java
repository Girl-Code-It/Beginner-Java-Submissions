/*
11111
00000
11111
00000
11111
 */


import java.io.*;
class pattern2
{
    public static void main ()
    {
        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=5; j++)
            {
                if (i%2==0)
                System.out.print ("0");
                else
                System.out.print ("1");
            }
            System.out.println ();
        }

    }
}