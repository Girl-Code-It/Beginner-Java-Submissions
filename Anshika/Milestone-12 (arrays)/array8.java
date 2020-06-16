/*Write a program to check if elements of an array are same or not it read from front or back. E.g.-
2	3	15	15	3	2
palindrome or not...*/

import java.io.*;
class array8
{
    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        int a[]=new int [10];
        System.out.println ("Enter elements in the array");
        for (int i=0; i<10; i++)
        {
            a[i]=Integer.parseInt (br.readLine());
        }

        boolean flag=false;
        for (int i=0; i<5; i++)
        {
            if (a[i]!=a[10-1-i])
            {
                flag=true;
                break;
            }
        }
        if (flag==false)
            System.out.println ("palindrome array");
        else
            System.out.println ("not palindrome array");
    }
}