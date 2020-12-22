package milestone17aRecursion;

import java.util.Scanner;

public class NoOfDigits {
	int count=0;
	int Digits(int n) {
		
		if(n>0) {
			
			count++;
			Digits(n/10);
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoOfDigits obj=new NoOfDigits();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int res=obj.Digits(n);
		System.out.println("No. of digits are : "+res);
       
	}

}
