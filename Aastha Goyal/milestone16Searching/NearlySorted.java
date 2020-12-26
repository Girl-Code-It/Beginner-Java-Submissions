package milestone16Searching;

import java.util.Scanner;

public class NearlySorted {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//	     int a[]= {10,20,30,50,40,60};
//	     int x=40;
//	     int start=0;
//	     int end=a.length-1;
//	     int mid;
//	     while(start<=end) {
//	    	 mid=(start+end)/2;
//	    	 if(a[mid]==x ) 
//	    		 System.out.println(mid);
//	    	 else if((mid-1)>=start && a[mid-1]==x)
//	    		 System.out.println(mid-1);
//	    	 else if((mid-1)<=end && a[mid+1]==x)
//	    		 System.out.println(mid+1);	
//	    	 else if(a[mid]>x) {
//	    		 end=mid-2;
//	    	 }
//	    	 else if(a[mid]<x) {
//	    		 start=mid+2;
//	    	 }
		int binarySearch(int a[],int l,int r,int x) {
			
			if(r>=l) {
				int mid=(l+r)/2;
				if(a[mid]==x)
					return mid;
			    if(mid>1 && a[mid-1]==x)
			    	return (mid-1);
			    if(mid<r && a[mid+1]==x)
			    	return (mid+1);
			    if(a[mid]>x)
			    	return binarySearch(a,l,mid-2 ,x);
			    else
			    	return binarySearch(a,mid+2,r,x);
			    	
			}
			return -1;
		
	     }
		public static void main(String[] args) {
			NearlySorted ob=new NearlySorted();
			int a[]= {10,20,30,50,40,60};
			int n=a.length;
		    int x=40;
		   int result=ob.binarySearch(a,0,n-1,x);
		   if(result==-1)
		   System.out.println("element not present");
		   else
			   System.out.println("element present at "+result);
					
					
					
					
					
					
					
					
					
					
			
		}
		
	}


