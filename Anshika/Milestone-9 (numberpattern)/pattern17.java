import java.io.*;
class pattern17
{
    public static void main ()
    {
        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=5; j++)
            {
                if (i>=j)
                System.out.print (i-j+1);
                else
                System.out.print (j-i+1);
            }
            System.out.println ();
        }

    }
}