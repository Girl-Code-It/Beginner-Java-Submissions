//https://practice.geeksforgeeks.org/problems/subset-sums/0


import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Collections;

class Subset_Sum {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while (t>0)
		{
		    int n=sc.nextInt();
		    ArrayList<Integer> li=new ArrayList<Integer>();
		    for (int i=0; i<n; i++)
		    {
		        li.add(sc.nextInt());
		    }
		    
		    ArrayList<Integer> l=new ArrayList<Integer>();
		    l=set(li,0,n,0,l);
		    Collections.sort(l);
		    for (int i=0; i<l.size(); i++)
		    {
		        System.out.print (l.get(i)+" ");
		    }
		    System.out.println ();
		    t--;
		}
	}
	
	static ArrayList<Integer> set (ArrayList<Integer> li, int i, int n, int sum, ArrayList<Integer> l)
	{
	    if (i==n)
	    {
	        
	        l.add(sum);
	    }
	    else
	    {
	        set (li,i+1,n,sum+li.get(i),l);
	        set (li,i+1,n,sum,l);
	    }
	    return l;
	}
}