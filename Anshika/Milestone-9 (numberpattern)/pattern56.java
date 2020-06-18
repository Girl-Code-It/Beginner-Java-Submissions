/*
1
123
12345
1234567
123456789
1234567
12345
123
1
*/

import java.io.*;
class pattern56
{
    public static void main ()
    {
        for (int i=1; i<=9; i+=2)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print (j);
            }
            System.out.println ();
        }

        for (int i=7; i>=1; i-=2)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print (j);
            }
            System.out.println ();
        }
    }
}