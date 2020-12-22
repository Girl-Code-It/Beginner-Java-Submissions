package milestone17aRecursion;

import java.util.Scanner;

public class BinarySearch {
	
	int Binarysearch(int l,int h, int a[],int x) {
		int mid=(l+h)/2;
		if(l<=h) {
			if (a[mid]==x)
				return mid ;
			else if(a[mid]<x)
				l=mid+1;
			else
				h=mid-1;
		
		  return Binarysearch(l,h,a,x);
		}
		 else
			 return mid;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch obj=new BinarySearch();
        Scanner sc=new Scanner(System.in);
        int a[]= {10,20,30,40,506,78};
        System.out.println("Enter a number to be search : ");
        int x=sc.nextInt();
        int l=0;
        int h=a.length;
        int res=obj.Binarysearch(l,h,a,x);
        System.out.println(x+" is present at index "+res);
       

	}

}
