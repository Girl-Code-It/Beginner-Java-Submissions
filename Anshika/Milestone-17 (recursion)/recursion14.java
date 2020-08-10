//Write a program to print even or odd numbers in given range using recursion.

import java.io.*;
class recursion14
{

    static void display_odd (int a, int b)
    {
        if (a>b)
        return;
        else if (a%2==1)
        {
            System.out.print (a+" ");
            display_odd (a+2,b);
        }
        else
        display_odd (a+1,b);
    }
    
    static void display_even (int a, int b)
    {
        if (a>b)
        return;
        else if (a%2==0)
        {
            System.out.print (a+" ");
            display_even (a+2,b);
        }
        else
        display_even (a+1,b);
    }

    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);
        
        System.out.println ("Enter range");
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        
        System.out.print ("All odd numbers from "+a+" to "+b+" are : ");
        display_odd(a,b);
        System.out.println ();
        System.out.print ("All even numbers from "+a+" to "+b+" are : ");
        display_even(a,b);
    }
}