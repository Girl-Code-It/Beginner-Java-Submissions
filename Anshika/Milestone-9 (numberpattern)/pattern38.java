import java.io.*;
class pattern38
{
    public static void main ()
    {
        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=i; j++)
            {
                if (i==5 || i==j || j==1)
                System.out.print ("1");
                else
                System.out.print ("0");
            }
            System.out.println ();
        }

    }
}