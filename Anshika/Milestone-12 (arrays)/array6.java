//Initialize and print all elements of a 2D array.
import java.io.*;
class array6
{
    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        int a[][]=new int [3][3];
        System.out.println ("Enter elements in the array");
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                a[i][j]=Integer.parseInt (br.readLine());
            }
        }

        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                System.out.print (a[i][j]);
            }
            System.out.println ();
        }
    }
}