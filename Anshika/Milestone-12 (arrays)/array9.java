/*Take an array of 10 elements. 
 * Split it into middle and store the elements in two dfferent arrays. E.g.-
INITIAL array :
58	24	13	15	63	9	8	81	1	78

After spliting :
58	24	13	15	63
9	8	81	1	78
*/
import java.io.*;
class array9
{
    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        int a[]=new int [10];
        System.out.println ("Enter elements in the array");
        for (int i=0; i<10; i++)
        {
            a[i]=Integer.parseInt (br.readLine());
        }

        int b[]=new int[5];
        int c[]=new int[5];

        for (int i=0; i<5; i++)
        {
            b[i]=a[i];
            c[i]=a[5+i];
        }
        for (int i=0; i<5; i++)
        {
            System.out.print (b[i]);
        }

        System.out.println ();

        for (int i=0; i<5; i++)
        {
            System.out.print (c[i]);
        }
    }
}