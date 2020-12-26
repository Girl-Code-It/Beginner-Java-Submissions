package milestone3;

import java.util.Scanner;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int m=0;
		int sum=0;
		while(n!=0) {
			
			m=n%10;
			n/=10;
			sum+=m;
		}
		System.out.println("Sum of digits of number is "+sum);

	}

}
