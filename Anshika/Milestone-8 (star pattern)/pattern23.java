import java.io.*;
class pattern23
{
    public static void main ()
    {
        for (int i=1; i<=9; i++)
        {
            for (int j=1; j<=9; j++)
            {
                if ((i+j)>=6 && (j-i)<=4 && (i-j)<=4 && (i+j)<=14)
                System.out.print ("*");
                else
                System.out.print (" ");
            }
            System.out.println ();
        }
    }
}