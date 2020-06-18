/*Given an N*N matrix.
Task is to print the product of the elements of left and right diagonal.
 */

import java.io.*;
class array31
{
    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        int ar[][]=new int[3][3];

        System.out.println ("Enter elements");
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                ar[i][j]=Integer.parseInt (br.readLine());
            }
        }

        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                System.out.print (ar[i][j]+" ");
            }
            System.out.println ();
        }

        int p=1;
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                if (i==j)
                    p=p*ar[i][j];
            }
        }
        System.out.println ("Principal diagonal -"+p);
        p=1;

        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                if (i+j==2)
                    p=p*ar[i][j];
            }
        }
        System.out.println ("Secondary diagonal -"+p);
    }
}