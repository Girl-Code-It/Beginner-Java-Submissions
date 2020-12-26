package milestone3;

import java.util.Scanner;

public class SumOfFirstAndLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int count=0;
		int m=n%10;
		System.out.println("Last Digit is:  "+ m);
		while(n>10) {
			n/=10;
			count++;
			
		}
		System.out.println("First Digit is: "+count);
		int sum=m+count;
		System.out.println("Sum of first and last digit is: "+sum);
		
	}

}
