import java.io.*;
class pattern7
{
    public static void main ()
    {
        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=9; j++)
            {
                if ((j-i)==0 || (j-i)==4 || (i==1 && (j-i)>=0 && (j-i)<=4) || (i==5 && (j-i)<=4 &&(j-i)>=0))
                System.out.print ("*");
                else
                System.out.print (" ");
            }
            System.out.println ();
        }
    }
}