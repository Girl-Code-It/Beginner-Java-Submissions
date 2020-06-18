//Write a program to swap first and last digits of a number.

import java.io.*;
class swapfirstandlastdigit
{
    public static void maine () throws IOException
    {
        InputStreamReader in =new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter value of n"); 
        int n=Integer.parseInt (br.readLine());
        
        int cnt=0, temp=n;
        
        while (temp!=0)
        {
            cnt++;
            temp=temp/10;
        }
        
        int a[]=new int [cnt];
        temp=n;
        int i=1;
        
        while (temp!=0)
        {
            a[cnt-i]=temp%10;
            temp=temp/10;
            i++;
        }
        
        temp=a[0];
        a[0]=a[cnt-1];
        a[cnt-1]=temp;
        
        System.out.print ("Reversed digits - ");
        
        for ( i=0; i<cnt; i++)
        {
            System.out.print (a[i]);
        }
    }
}