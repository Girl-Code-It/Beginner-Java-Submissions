/**
 * Write a program in C to find the Hailstone Sequence of a given number upto 1
 * 
 * If N is even, divide it by 2 to give N = N/2.
   If N is odd, multiply it by 3 and add 1 to give N = 3N + 1.
   
   Example N=13
   Hailstone sequence : 13  40  20  10  5  16  8  4  2 1 .....
   
   Input any number (positive) to start for Hailstone Sequence : 13
   Expected Output :
 The hailstone sequence starting at 13 is :                                                                   
 13  40  20  10  5  16  8  4  2 1                                                                             
 The length of the sequence is 10.
 */

import java.io.*;
class recursion18
{

    static int hailstoneSequence (int n)
    {
        if (n==1)
          {
              System.out.print (n);
              return 1;
            }
        else
        {
            System.out.print (n+" ");
            if (n%2==0)
            return 1 + hailstoneSequence (n/2);
            else
            return 1 + hailstoneSequence (n*3+1);
        }
    }

    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter value of N");
        int n=Integer.parseInt (br.readLine());
        
        System.out.println ("The hailstone sequence starting at "+n+" is : ");
        int cnt= hailstoneSequence (n);
        System.out.println ();
        System.out.println ("The length of the sequence is "+cnt);
    }
}
