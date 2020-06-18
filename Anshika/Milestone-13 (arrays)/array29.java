/*Initialize a 2D array of 3*3 matrix. E.g.-
1	2	3
4	5	6
7	8	9

Check if the matrix is symmetric or not.
 */
import java.io.*;
class array29
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

        boolean flag=false;

        for (int i=0; i<3; i++)
        {
            for (int j=0; j<i; j++)
            {
                if (ar[i][j]!=ar[j][i])
                {
                    flag=true;
                    break;
                }
            }
            if (flag==true)
                break;
        }

        if (flag==false)
            System.out.println ("Symmetric");
        else
            System.out.println ("Not Symmetric");
    }
}