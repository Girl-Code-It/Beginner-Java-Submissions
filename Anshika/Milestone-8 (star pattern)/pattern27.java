import java.io.*;
class pattern27
{
    public static void main ()
    {
        for (int i=1; i<=9; i++)
        {
            for (int j=1; j<=5; j++)
            {
                if (((i==1 || i==5 || i==9) && (j!=1 && j!=5)) || ((j==1 || j==5) && (i!=1 && i!=5 && i!=9)))
                System.out.print ("*");
                else
                System.out.print (" ");
            }
            System.out.println ();
        }
    }
}