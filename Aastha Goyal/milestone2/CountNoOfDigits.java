package milestone2;

import java.util.Scanner;

public class CountNoOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int count=0;
		
		while(n!=0) {
			n/=10;
			count++;
			
		}
		System.out.println("No. of digits are "+ count);
		
		

	}

}
