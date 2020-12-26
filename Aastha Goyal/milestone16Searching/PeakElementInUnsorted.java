package milestone16Searching;

public class PeakElementInUnsorted {
	
	int PeakElement(int a[],int l,int r,int n) {
		int mid=l+(r-l)/2;
		if(mid>0 && mid<n-1) 
		{
			if(a[mid]>a[mid-1] && a[mid]>a[mid+1])
				return mid;
			else if(a[mid-1]>a[mid])
				r=mid-1;
			else 
				l=mid+1;
			
	    }
		else if(mid==0)
		{
			if(a[0]>a[1])
				return 0;
			else
				return 1;
		}
		else if(mid==n-1)
		{
			if(a[n-1]>a[n-2])
				return n-1;
			else
				return n-2;
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PeakElementInUnsorted obj=new PeakElementInUnsorted();
		int a[]= {1,3,5,4,20,0};
	
		int n=a.length;
	    int x=40;
	   int result=obj.PeakElement(a,0,n-1,n-1);
	   if(result==-1)
	   System.out.println("Peak element is not present");
	   else
		   System.out.println("Peak element is present at "+ result);
		
        
	}

}
