//Write a program to find first and last digit of a number.

import java.io.*;
class firstandlastdigit
{
    public static void maine () throws IOException
    {
        InputStreamReader in =new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter value of n"); 
        int n=Integer.parseInt (br.readLine());

        int d1, d2, temp=n;
        d2=n%10;

        while (temp>9)
        {
            temp=temp/10;
        }
        d1=temp;

        System.out.println ("first digit is "+d1+ " and last digit is "+d2);
    }
}