package milestone16Searching;

import java.util.Scanner;

public class CountofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		     Scanner sc=new Scanner(System.in);
		     int a[]= {2,4,10,10,10,10,18,18,20};
		     int x=18;
		     int start=0;
		     int end=a.length-1;
		     
		     int mid=(start+end)/2;
		     int mid1=(start+end)/2;
		     int res=mid,res1=mid1;
		     int count;
		     while(start<=end) {
		    	 mid=(start+end)/2;
		    	 if(a[mid]==x)
		    	 {
		    		 res=mid;
		    		 end=mid-1;
		    		 
		    	 }
		    	 else if(a[mid]>x)
		    		 end=mid-1;
		    	 else
		    		 start=mid+1;
		    
		    		 
		     }
		     //System.out.println(res);
		     while(start<=end) {
		    	 mid1=(start+end)/2;
		    	 if(a[mid1]==x)
		    	 {
		    		 res1=mid1;
		    		 start=mid1+1;
		    		 
		    	 }
		    	 else if(a[mid1]>x)
		    		 end=mid1-1;
		    	 else
		    		 start=mid1+1;
		    
		    		 
		     }
		     System.out.println(res);
		     System.out.println(res1);
		     count=(res1-res)+1;
		     if(res==-1)
		    	 System.out.println(count);
		     else
		     System.out.println(count);
		     
		     
			}

		

}
