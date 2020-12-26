package milestone17bRecursion;

import java.util.Scanner;

public class Floor {
  int temp=0;
	 int Floor(int a[],int n,int l,int h) {
		 
	   int mid=h+(l-h)/2;
		if(l<=h) {
			if(a[mid]==n) {
			    temp=a[mid];
				return temp;
				}
			if(a[mid]<n) {
				temp=a[mid];
				l=mid+1;
			}
			else {
				h=mid-1;
			}
			Floor(a,n,l,h);
		}
			
				return temp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Floor obj=new Floor ();
		Scanner sc=new Scanner(System.in);
       int a[]= {10,20,30,40,50};
       System.out.println("Enter a number: ");
       int n=sc.nextInt();
       int h=a.length-1;
       int l=0;
       int res=obj.Floor(a,n,l,h);
       System.out.println(res);
	}

}
