package milestone3;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int m=1;
		int product=1;
		while(n!=0) {
			
			m=n%10;
			n/=10;
			System.out.print(m);
		}
	}

}
