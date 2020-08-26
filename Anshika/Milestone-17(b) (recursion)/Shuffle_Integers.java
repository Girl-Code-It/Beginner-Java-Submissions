//https://practice.geeksforgeeks.org/problems/shuffle-integers/0

import java.util.*;
import java.lang.*;
import java.io.*;

class Shuffle_Integers
 {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while (t>0)
		{
		    int n=sc.nextInt();
		    int ar[]=new int[n];
		    for (int i=0; i<n; i++)
		    {
		        ar[i]=sc.nextInt();
		    }
		    
		    display(ar,0,n/2);
		    if (n%2==1)
		    System.out.print (ar[n-1]+" ");
		    System.out.println ();
		    
		    
		    t--;
		}
	}
	
	static void display (int[] ar, int i, int n)
	{
	    if (i==n)
	    return;
	    else
	    {
	        System.out.print (ar[i]+" ");
	        System.out.print (ar[n+i]+" ");
	        display(ar,i+1,n);
	    }
	}
}