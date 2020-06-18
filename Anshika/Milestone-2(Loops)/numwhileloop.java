//Write a program to print all natural numbers from 1 to n. - using while loop

import java.io.*;
class numwhileloop
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter value of n");
        int n=Integer.parseInt (br.readLine());

        int i=1;
        while(i<=n)
        {
            System.out.println (i);
            i++;
        }
    }
}