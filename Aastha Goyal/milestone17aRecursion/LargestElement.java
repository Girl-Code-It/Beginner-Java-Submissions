package milestone17aRecursion;

import java.util.Scanner;

public class LargestElement {
	int i=0,k=-1;
	 int LargestElement(int a[],int n) {
		
		while(i<n)
		{
		if(a[i]>k) {
			k=a[i];
			i++;
			
		}
		else { 
			i++;
	        LargestElement(a,n);
		}
		
		}
		return k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestElement obj=new LargestElement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements:  ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int res=obj.LargestElement(a,n);
		System.out.println(res);

	}

}
