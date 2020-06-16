import java.io.*;
class pattern19
{
    public static void main ()
    {
        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=9; j++)
            {
                if (j>=i && (i+j)<=10)
                System.out.print ("*");
                else
                System.out.print (" ");
            }
            System.out.println ();
        }
    }
}