/*Write a program to find the sum and product of all elements of an array.*/
import java.io.*;
class array5
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

        int sum=0, product=1;
        
        for (int i=0; i<10; i++)
        {
            sum=sum+a[i];
            product=product*a[i];

        }
        
        System.out.println ("sum - "+sum+" product - "+product);
    }
}