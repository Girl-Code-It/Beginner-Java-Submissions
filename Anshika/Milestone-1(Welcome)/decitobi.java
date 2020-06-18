import java.io.*;
class decitobi
{
    public static void main (String args[]) throws IOException
    {
        InputStreamReader in =new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter a no.");
        int n=Integer.parseInt (br.readLine());

        int a[]=new int [8];
        int temp=n, i=0;

        while (temp!=0)
        {
            a[i]=temp%2;
            temp=temp/2;
            i++;
        }
        
        
        for (int j=i; j<=8; j++)
        {
            a[j]=0;

        }
        
        for (int j=7; j>=0; j--)
        {
            System.out.print (a[j]);

        }
    }
}