import java.io.*;
class pattern21
{
    public static void main ()
    {
        for (int i=1; i<=9; i++)
        {
            for (int j=1; j<=5; j++)
            {
                if (j==1 || i==j || (i+j)==10)
                System.out.print ("*");
                else
                System.out.print (" ");
            }
            System.out.println ();
        }
    }
}