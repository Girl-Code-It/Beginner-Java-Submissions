import java.io.*;
class pattern9
{
    public static void main ()
    {
        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=i; j++)
            {
                if (j==1 || i==j || i==5)
                System.out.print ("*");
                else
                System.out.print (" ");
            }
            System.out.println ();
        }
    }
}