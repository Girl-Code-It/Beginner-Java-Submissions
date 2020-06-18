import java.io.*;
class extra2
{
    public static void main () 
    {
        int k;
        for (int i=1; i<=5; i++)
        {
            if (i%2==0)
                k=2;
            else
                k=1;
            for (int j=1; j<=i; j++)
            {
                System.out.print (k);
                k+=2;
            }
            System.out.println ();
        }
    }
}