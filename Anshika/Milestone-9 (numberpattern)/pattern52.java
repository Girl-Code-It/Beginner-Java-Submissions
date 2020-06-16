import java.io.*;
class pattern52
{
    public static void main ()
    {
        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=i; j++)
            {
                if (i<=3)
                System.out.print (i);
                else
                System.out.print (5-i+1);
            }
            System.out.println ();
        }

    }
}