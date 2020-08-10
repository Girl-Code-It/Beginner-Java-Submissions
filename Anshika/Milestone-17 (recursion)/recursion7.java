// Write a program to find GCD of two numbers using recursion.

import java.io.*;
class recursion7
{

    static int gcd (int a, int b, int min)
    {
        if (min==1)
            return 1;
        else if (a%min==0 && b%min==0)
            return min;
        else
            return gcd(a,b,min-1);
    }

    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter values of a and b");
        int a=Integer.parseInt (br.readLine());
        int b=Integer.parseInt (br.readLine());

        int l=gcd (a,b,Math.min(a,b));
        System.out.println ("G.C.D of "+a+" and "+b+" is : "+l);
    }
}
