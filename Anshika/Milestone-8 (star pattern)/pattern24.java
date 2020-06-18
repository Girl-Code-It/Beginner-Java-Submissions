import java.io.*;
class pattern24
{
    public static void main ()
    {
        for (int i=1; i<=10; i++)
        {
            for (int j=1; j<=10; j++)
            {
                if ((i+j)>6 && (i+j)<16 && (i-j)<=4 && (j-i)<=4)
                System.out.print (" ");
                else
                System.out.print ("*");
            }
            System.out.println ();
        }
    }
}