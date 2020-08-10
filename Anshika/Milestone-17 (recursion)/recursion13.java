//Write a program to find the LCM of two numbers using recursion

import java.io.*;
class recursion13
{

    static int lcm (int a, int b, int d)
    {
        if (a==1 && b==1)
            return 1;
        else if (a%d==0 && b%d==0)
            return d * lcm (a/d,b/d,d);
        else if (a%d==0)
            return d * lcm (a/d,b,d);
        else if (b%d==0)
            return d * lcm (a,b/d,d);
        else
            return lcm(a,b,d+1);
    }

    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter values of a and b");
        int a=Integer.parseInt (br.readLine());
        int b=Integer.parseInt (br.readLine());

        int l=lcm (a,b,2);
        System.out.println ("L.C.M of "+a+" and "+b+" is : "+l);
    }
}
