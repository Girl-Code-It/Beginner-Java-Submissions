import java.io.*;
class extra1
{
    public static void main () 
    {
        for (int i=7; i>=1; i-=2)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print (j);
            }
            System.out.println ();
        }
    }
}