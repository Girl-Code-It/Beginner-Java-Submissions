package milestone17aRecursion;

import java.util.Scanner;

public class Prime {
	
	 int Prime(int n,int i) {
		 
		if(i==1)
			return 1;
		else if(n%i==0)
		{
			return 0;
		}
		else
		{
			i--;
			return Prime(n,i);
		}
			
		
		
			 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Prime obj=new Prime();
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int i=n/2;
		int prime=obj.Prime(n,n/2);
		//int i=n/2;
		if(prime==1)
			System.out.println("prime");
		else
			System.out.println("not prime");

	}

}
