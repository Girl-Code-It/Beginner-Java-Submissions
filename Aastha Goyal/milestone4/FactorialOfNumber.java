package milestone4;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int f=1;
		for(int i=1;i<=num;i++) {
			f=f*i;
		}
		System.out.println("Factorial of "+num +" is "+f);
		

	}

}
