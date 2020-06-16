//Write a program to count number of digits in a number.

import java.io.*;
class cntdigits
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

        System.out.println ("no of digits are "+cnt);
    }
}