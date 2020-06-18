//Write a program to print multiplication table of any number.

import java.io.*;
class multiplicationtable
{
    public static void maine () throws IOException
    {
        InputStreamReader in =new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter value of n"); 
        int n=Integer.parseInt (br.readLine());

        int m=1;

        for(int i=1; i<=10; i++)
        {
            m=n*i;
            System.out.println (n+" * "+i+" = "+m);

        }
    }
}