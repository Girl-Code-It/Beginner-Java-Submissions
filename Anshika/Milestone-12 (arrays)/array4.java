/*Take 10 integer inputs from user and store them in an array. 
 * Now, copy all the elements in an another array but in reverse order.*/
import java.io.*;
class array4
{
    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        int a[]=new int[10];
        System.out.println ("enter elements in the array");
        for (int i=0; i<10; i++)
        {
            a[i]=Integer.parseInt (br.readLine());
        }

        int b[]=new int[10];
        for (int i=9; i>=0; i--)
        {
            b[i]=a[10-i-1];
        }

        System.out.println ("new array is - ");
        for (int i=0; i<10; i++)
        {
            System.out.print (b[i]);
        }
    }
}