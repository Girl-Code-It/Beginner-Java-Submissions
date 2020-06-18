import java.io.*;
class pattern15
{
    public static void main ()
    {
        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=5; j++)
            {
                if (i==1 || j==1)
                System.out.print ("5");
                else if (i==2 || j==2)
                System.out.print ("4");
                else if (i==3 || j==3)
                System.out.print ("3");
                else if (i==4 || j==4)
                System.out.print ("2");
                else
                System.out.print ("1");
                
            }
            System.out.println ();
        }

    }
}