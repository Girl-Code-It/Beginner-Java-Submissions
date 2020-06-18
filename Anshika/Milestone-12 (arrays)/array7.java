//Find largest and smallest elements of an array.
import java.io.*;
class array7
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

        int max=a[0], min=a[0];
        for (int i=0; i<10; i++)
        {
            if (a[i]>=max)
                max=a[i];
            if (a[i]<min)
                min=a[i];
        }

        System.out.println ("min - "+min+" max - "+max);
    }
}