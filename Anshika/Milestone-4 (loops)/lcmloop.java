//Write a program to find LCM of two numbers.

import java.io.*;
class lcmloop
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter 4 digit no.");
        int a=Integer.parseInt (br.readLine());
        int b=Integer.parseInt (br.readLine());

        int lcm=1, d=2;

        while (a!=1 || b!=1)
        {
            if (a%d==0 && b%d==0)
            {
                lcm=lcm*d;
                a=a/d;
                b=b/d;
            }

            else if (a%d==0)
            {
                lcm=lcm*d;
                a=a/d;
            }

            else if (b%d==0)
            {
                lcm=lcm*d;
                b=b/d;
            }

            else
                d++;
        }

        System.out.println ("L.C.M is "+lcm);
    }
}