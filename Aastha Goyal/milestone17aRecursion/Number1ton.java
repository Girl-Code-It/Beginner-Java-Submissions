package milestone17aRecursion;

import java.util.Scanner;

import milestone16Searching.NearlySorted;

public class Number1ton {
	static void  Print(int n){
		if(n==1)
			System.out.print( "1");
		else {
			System.out.print(n+" ");
			Print(n-1);
		}   
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number: ");
		Scanner sc=new Scanner(System.in);
		Number1ton ob=new Number1ton();
		int n=sc.nextInt();
		Print(n);

	}

}
