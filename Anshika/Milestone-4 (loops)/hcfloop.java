//Write a program to find HCF (GCD) of two numbers.

import java.io.*;
class hcfloop
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter two no.");
        int a=Integer.parseInt (br.readLine());
        int b=Integer.parseInt (br.readLine());
        int hcf=1;

        int min=Math.min(a,b);
        for (int i=min; i>=1; i--)
        {
            if (a%i==0 && b%i==0)
            {
                hcf=i;
                break;
            }
        }

        System.out.println ("H.C.F is "+hcf);
    }
}