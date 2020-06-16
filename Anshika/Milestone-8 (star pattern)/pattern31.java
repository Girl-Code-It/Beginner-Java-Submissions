import java.io.*;
class pattern31
{
    public static void main ()
    {
        for (int i=1; i<=3; i++)
        {
            for (int j=1; j<=19; j++)
            {
                if (((i+j)>=4 && (j-i)<=6) || ((i+j)>=14 && (j-i)<=16)) 
                    System.out.print ("*");
                else
                    System.out.print (" ");
            }
            System.out.println ();
        }

        for (int i=1; i<=5; i++)
        {
            System.out.print ("*");
        }

        System.out.print ("Codeforwin");

        for (int i=1; i<=4; i++)
        {
            System.out.print ("*");
        }

        System.out.println ();

        for (int i=1; i<=9; i++)
        {
            for (int j=1; j<=19; j++)
            {
                if ((j-i)>0 && (i+j)<20) 
                    System.out.print ("*");
                else
                    System.out.print (" ");
            }
            System.out.println ();
        }
    }
}