//If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60], your program should be able to find that the subarray lies between the indexes 3 and 8.

import java.io.*;
class array14
{
    public static void main (String args[]) 
    {
        int a[]={10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};

        for (int i=4; i<8; i++)
        {
            System.out.print (a[i]+" ");
        }

    }
}