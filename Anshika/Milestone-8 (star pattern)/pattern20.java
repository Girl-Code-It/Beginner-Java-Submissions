import java.io.*;
class pattern20
{
    public static void main ()
    {
        for (int i=1; i<=9; i++)
        {
            for (int j=1; j<=5; j++)
            {
                if ((i-j)>=0 && (i+j)<=10)
                System.out.print ("*");
                else
                System.out.print (" ");
            }
            System.out.println ();
        }
    }
}