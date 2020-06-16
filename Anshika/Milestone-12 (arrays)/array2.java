/*Take 10 integer inputs from user and store them in an array. 
 * Again ask user to give a number.
 * Now, tell user whether that number is present in array or not.*/
import java.io.*;
class array2
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

        System.out.println ("enter a no. to be searched");
        int n=Integer.parseInt (br.readLine());

        boolean flag=false;
        for (int i=0; i<10; i++)
        {
            if (a[i]==n)
            {
                flag=true; 
                break;
            }
        }

        if (flag==true)
            System.out.println ("no. found");
        else
            System.out.println ("no. not found");
    }
}