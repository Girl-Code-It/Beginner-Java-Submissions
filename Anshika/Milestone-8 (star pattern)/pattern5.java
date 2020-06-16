import java.io.*;
class pattern5
{
    public static void main ()
    {
        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=9; j++)
            {
                if ((i+j)==6 || (i+j)==10 || (i==1 && (i+j)<=10 && (i+j)>=6) || (i==5 && (i+j)>=6 && (i+j)<=10)) 
                System.out.print ("*");
                else
                System.out.print (" ");
            }
            System.out.println ();
        }
    }
}