//Write a program to find frequency of each digit in a given integer.

import java.io.*;
class frequencyofdigits
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter a no.");
        int n=Integer.parseInt (br.readLine());

        int temp=n, cnt=0;

        while (temp!=0)
        {
            cnt++;
            temp=temp/10;
        }

        int a[]=new int [cnt];

        temp=n;
        int d;

        for (int i=0; i<cnt; i++)
        {
            d=temp%10;
            a[i]=d;
            temp=temp/10;        
        }

        int temp1;

        for (int i=0; i<cnt; i++)
        {
            for (int j=0; j<cnt-1-i; j++)
            {
                if (a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        cnt=0;
        int store=a[0];

        for (int i=0; i<a.length; i++)
        {
            if (store==a[i])
                cnt++;
            else
            {
                System.out.println (store+" present "+cnt+" times");
                cnt=1;
                store=a[i];
            }
        }

        System.out.println (store+" present "+cnt+" times");
    }
}