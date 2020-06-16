/*Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number os 0.*/
import java.io.*;
class array3
{
    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        int a[]=new int [20];
        System.out.println ("Enter elements in the array");
        for (int i=0; i<20; i++)
        {
            a[i]=Integer.parseInt (br.readLine());
        }

        int odd=0, even=0, pos=0, neg=0, zero=0;
        for (int i=0; i<20; i++)
        {
            if (a[i]%2==0)
            even++;
            else
            odd++;
            
            if (a[i]>0)
            pos++;
            else if (a[i]<0)
            neg++;
            else
            zero++;
        }
        
        System.out.println ("even -"+even+"\nodd -"+odd+"\npositive -"+pos+"\nnegative -"+neg+"\nzeros"+zero);
    }
}