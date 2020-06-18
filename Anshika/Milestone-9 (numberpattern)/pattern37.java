import java.io.*;
class pattern37
{
    public static void main ()
    {
        int k=1;
        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print (k%2);
                k++;
            }
            System.out.println ();
        }

    }
}