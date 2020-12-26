package milestone16Searching;

import java.util.Scanner;

public class CeilSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	       int a[]= {1,2,3,4,8,9,10,11};
	       int l=0,r=a.length,x=5;
	       int mid,res=0;
	       while(r>=l) {
	    	   mid=(l+r)/2;
	    	   if(a[mid]==x) {
	    		   //System.out.println(a[mid]);
	    		   res=a[mid];
	    		   break;
	    	   }
	    	   if(a[mid]<x)
	    	   {
                   l=mid+1;
	    	   }
	    	   else if(a[mid]>x) {
	    		   res=a[mid];
	    		   r=mid-1;
	    		   
	    	   }
	    	   
	       }
	       System.out.println("Ceil value of "+x+" is "+res);
	}

}
