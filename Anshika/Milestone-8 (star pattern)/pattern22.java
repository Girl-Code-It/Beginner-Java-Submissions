import java.io.*;
class pattern22
{
    public static void main ()
    {
        for (int i=1; i<=9; i++)
        {
            for (int j=1; j<=5; j++)
            {
                if ((i+j)>=6 && (i-j)<=4)
                System.out.print ("*");
                else
                System.out.print (" ");
            }
            System.out.println ();
        }
    }
}