//https://practice.geeksforgeeks.org/problems/tower-of-hanoi/0


import java.util.*;
import java.lang.*;
import java.io.*;

class Tower_of_Hanoi
 {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while (t>0)
		{
		    t--;
		    
		    int n=sc.nextInt();
		    
		    int ans=0;
		    ans=solve(1,2,3,n);
		    System.out.println (ans);
		}
	}
	
	static int solve (int s, int h, int d, int n)
	{
	    if (n==1)
	    {
	        System.out.println ("move disk 1 from rod "+s+" to rod "+d);
	        return 1;

	    }
	    else
	    {
	        int x=solve (s,d,h,n-1);
	        System.out.println ("move disk "+n+" from rod "+s+" to rod "+d);
	        return x+1+solve (h,s,d,n-1);
	    }


	}
}