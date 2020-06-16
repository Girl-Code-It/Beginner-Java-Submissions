/*Take 10 integer inputs from user and store them in an array and print them on screen.*/
import java.io.*;
class array1
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

        for (int i=0; i<10; i++)
        {
            System.out.print (a[i]);
        }
    }
}