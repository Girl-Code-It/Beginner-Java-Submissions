package milestone16Searching;

import java.util.Scanner;

public class LastOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		     Scanner sc=new Scanner(System.in);
		     int a[]= {2,4,10,10,10,18,20};
		     int x=10;
		     int start=0;
		     int end=a.length-1;
		    // int res=mid;
		     int mid;
		     int res=mid=(start+end)/2;
		     while(start<=end) {
		    	 mid=(start+end)/2;
		    	 if(a[mid]==x)
		    	 {
		    		 res=mid;
		    		 start=mid+1;
		    		 
		    	 }
		    	 else if(a[mid]>x)
		    		 end=mid-1;
		    	 else
		    		 start=mid+1;
		    
		    		 
		     }
		     System.out.println(res);
		     
			}

		

	

}
