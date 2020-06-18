import java.io.*;
class pattern7
{
    public static void main ()
    {
        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=5; j++)
            {
                if (i==3 || j==3)
                System.out.print ("0");
                else
                System.out.print ("1");
            }
            System.out.println ();
        }

    }
}