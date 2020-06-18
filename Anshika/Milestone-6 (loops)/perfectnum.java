//Write a program to check whether a number is Perfect number or not.

import java.io.*;
class perfectnum
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter a no.");
        int n=Integer.parseInt (br.readLine());
        
        int sum=0;

        
            for (int j=1; j<=n/2; j++)
            {
                if (n%j==0)
                    sum=sum+j;
            }
            
            if (sum==n)
            System.out.println (n);
        }
    }
