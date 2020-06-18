import java.io.*;
class pattern33
{
    public static void main ()
    {
        int k;

        for (int i=5; i>=1; i--)
        {
            k=i;
            for (int j=1; j<=i; j++)
            {
                System.out.print (k);
                k++;
            }
            System.out.println ();
        }
    }

}