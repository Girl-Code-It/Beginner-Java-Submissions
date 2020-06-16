//Write program to find two's complement of a binary number.

import java.io.*;
class twoscomplement
{
    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        int a[]=new int[8];

        System.out.println ("Enter a binary no.");
        for (int i=0; i<8; i++)
        {
            a[i]=Integer.parseInt (br.readLine());
        }

        System.out.println ("binary no. -");
        for (int i=0; i<8; i++)
        {
            System.out.print (a[i]);
        }

        for (int i=0; i<8; i++)
        {
            if (a[i]==0)
                a[i]=1;
            else
                a[i]=0;
        }

        System.out.println ();
        System.out.println ("one's complement -");

        for (int i=0; i<8; i++)
        {
            System.out.print (a[i]);
        }
        
        int carry=1;
        
        for (int i=7; i>=0; i--)
        {
            if (a[i]==1 && carry==1)
            {
                a[i]=0;
                carry=1;
            }
            else if (a[i]==0 && carry==1)
            {
                a[i]=1;
                carry=0;
            }
            
            
        }
        
        System.out.println ("two's complement -");
        for (int i=0; i<8; i++)
        {
            System.out.print (a[i]);
        }
    }
}