/*Take an array of length n where all the numbers are nonnegative and unique. 
 * Find the element in the array possessing the highest value. 
 * Split the element into two parts where first part contains the next highest value in the array and second part hold the required additive entity to get the highest value. 
 * Print the array where the highest value get splitted into those two parts.
Sample input: 4 8 6 3 2
Sample output: 4 6 2 6 3 2*/
import java.io.*;
class array33
{
    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter value of n");
        int n=Integer.parseInt (br.readLine());
        int a[]=new int[n];

        for (int i=0; i<n; i++)
        {
            a[i]=Integer.parseInt (br.readLine());
        }

        int b[]=new int[n+1];
        int max=a[0], store=0;

        for (int i=0; i<n; i++)
        {
            if (a[i]>max)
            {
                max=a[i];
                store=i;
            }
        }

        int max1=a[0];
        for (int i=0; i<n; i++)
        {
            if (a[i]>max1 && a[i]<max)
                max1=a[i];
        }

        for (int i=0; i<store; i++)
        {
            b[i]=a[i];
        }

        b[store]=max1;
        b[store+1]=max-max1;

        for (int i=store+1; i<n; i++)
        {
            b[i+1]=a[i];
        }

        for (int i=0; i<n+1; i++)
        {
            System.out.print (b[i]);
        }
    }
}