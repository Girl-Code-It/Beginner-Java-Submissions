// Write a program to convert a decimal number to binary using recursion

import java.io.*;
class recursion11
{

    static int binary (int n)
    {
        if (n==1)
        return 1;
        else
        {
            return binary (n/2)*10 + n%2; 
        }
    }

    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter the decimal no.");
        int n=Integer.parseInt (br.readLine());

        int b=binary (n);
        System.out.println ("Binary conversion : "+b);
    }
}
