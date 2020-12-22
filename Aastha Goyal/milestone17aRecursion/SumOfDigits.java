package milestone17aRecursion;

import java.util.Scanner;

public class SumOfDigits {
	
	int sum=0;
	int Digits(int n) {
		
		if(n==0)
			return 0;
		else
		return (n%10)+Digits(n/10);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfDigits obj=new SumOfDigits();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int res=obj.Digits(n);
		System.out.println("Sum of digits are : "+res);
	}

}
