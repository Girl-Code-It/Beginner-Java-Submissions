package milestone16Searching;

import java.util.Scanner;

public class NoOfTimeSortedArrayIsRotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int a[]= {8,10,11,15,2,4,6};
        int l=0,r=a.length,x=5;
        int n=a.length;
	    int mid,res=0;
	    
	    while(l<=r) {
	    	mid=(l+r)/2;
	    	int next=(mid+1)%n;
	    	int prev=(mid+n-1)%n;
	    	if(a[mid]<=a[next] && a[mid]<=a[prev])
	    		System.out.println(mid);
	    	if(a[l]<=a[mid])
	    		l=mid+1;
	    	else if(a[mid]<=a[r])
	    		r=mid-1;
	    	
	    }
        
	}

}
