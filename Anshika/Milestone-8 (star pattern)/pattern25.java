import java.io.*;
class pattern25
{
    public static void main ()
    {
        for (int i=1; i<=9; i++)
        {
            for (int j=1; j<=9; j++)
            {
                if (i==5 || j==5)
                System.out.print ("*");
                else
                System.out.print (" ");
            }
            System.out.println ();
        }
    }
}