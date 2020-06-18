/*Consider an integer array, the number of elements in which is determined by the user.
 * The elements are also taken as input from the user.
 * Write a program to find those pair of elements that has the maximum and minimum difference among all element pairs.*/
import java.io.*;
class array10
{
    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("enter no. of elements");
        int n=Integer.parseInt (br.readLine());

        int a[]=new int [n];
        System.out.println ("Enter elements in the array");
        for (int i=0; i<n; i++)
        {
            a[i]=Integer.parseInt (br.readLine());
        }
        int temp;

        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n-1-i; j++)
            {
                if (a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        
        int max=a[n-1], min1=a[0], min2=a[1];
        
        System.out.println ("pairs - "+max+" and "+min1+"\n"+min1+" and "+min2);
    }
}