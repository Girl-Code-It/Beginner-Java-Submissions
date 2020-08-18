//https://practice.geeksforgeeks.org/problems/help-the-old-man/0


import java.util.*;
import java.lang.*;
import java.io.*;

class Help_the_Old_Man
 {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while (t>0)
		{
		    int n=sc.nextInt();
		     N=sc.nextInt();
		    count=0;
		    print (1,2,3,n);
		    
		    t--;
		}
	}
	static int N,count;
	
	static void print (int s, int h, int d, int n)
	{
	    if (n==0)
	    {
	        return;
	    }
	    else
	    {
	        print (s,d,h,n-1);
	        count++;
	        if (count==N)
	        {
	            System.out.println (s+" "+d);
	        }
	        print (h,s,d,n-1);
	    }
	}
}