import java.io.*;
class pattern13
{
    public static void main ()
    {
        for (int i=1; i<=5; i++)
        {
            for (int j=i; j<=5; j++)
            {
                if (i==1 || j==5 || j==i)
                System.out.print ("*");
                else
                System.out.print (" ");
            }
            System.out.println ();
        }
    }
}