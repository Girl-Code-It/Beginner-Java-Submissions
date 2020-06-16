import java.io.*;
class pattern29
{
    public static void main ()
    {
        for (int i=1; i<=5; i++)
        {
            for (int j=5; j>=i; j--)
            {

                System.out.print (j);
            }
            System.out.println ();
        }

    }
}