/*
01010
01010
01010
01010
01010
 */

import java.io.*;
class pattern3
{
    public static void main ()
    {
        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=5; j++)
            {
                if (j%2==0)
                System.out.print ("1");
                else
                System.out.print ("0");
            }
            System.out.println ();
        }

    }
}