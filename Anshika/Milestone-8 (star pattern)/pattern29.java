import java.io.*;
class pattern29
{
    public static void main ()
    {
        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=9; j++)
            {
                if ((i+j)>=6 && (i+j)<=(11-i)) 
                    System.out.print ("*");
                else
                    System.out.print (" ");
            }
            System.out.println ();
        }

        for (int i=1; i<=4; i++)
        {
            for (int j=1; j<=9; j++)
            {
                if ((j-i)>=1 && (j-i)<=(i+1)) 
                    System.out.print ("*");
                else
                    System.out.print (" ");
            }
            System.out.println ();
        }
    }
}