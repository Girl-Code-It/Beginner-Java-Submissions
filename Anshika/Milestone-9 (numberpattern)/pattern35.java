import java.io.*;
class pattern35
{
    public static void main ()
    {
        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print (j%2);
            }
            System.out.println ();
        }

    }
}