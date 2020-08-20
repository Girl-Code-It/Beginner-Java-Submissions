//https://practice.geeksforgeeks.org/problems/number-of-paths/0

import java.util.*;
import java.lang.*;
import java.io.*;

class Number_of_Paths {
	public static void main (String[] args) {
	    
	    Scanner sc=new Scanner (System.in);
	    int t=sc.nextInt();
	    while (t>0)
	    {
	        int m=sc.nextInt();
	        int n=sc.nextInt();
	        
	        int x=recur(m,n,0,0);
	        System.out.println (x);
	        
	        t--;
	    }
		//code
	}
	
	static int recur(int m, int n, int i, int j)
	{
	    if (i==m-1 && j==n-1)
	    return 1;
	    else
	    {
	        if (i==m-1)
	        {
	            return recur(m,n,i,j+1);
	        }
	        else if (j==n-1)
	        {
	            return recur(m,n,i+1,j);
	        }
	        else
	        {
	            return recur(m,n,i+1,j) + recur(m,n,i,j+1);
	        }
	    }
	    
	}
}