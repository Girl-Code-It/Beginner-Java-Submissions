package milestone17aRecursion;

import java.util.Scanner;

public class PrintArray {
	
	static void Array(int count,int n) {
		int b[]=new int[n];
		if(count<n) {
			int a[]=new int[n];
			
			Scanner sc=new Scanner(System.in);
			System.out.println("element is: ");
			a[count]=sc.nextInt();
			System.out.println(a[count]);
	       			count++;
			Array(count,n);

		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintArray obj =new PrintArray();
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter no. of elements in array: ");
		int n=sc.nextInt();
		Array(0,n);
		

	}

}
