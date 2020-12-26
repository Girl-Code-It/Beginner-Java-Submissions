package milestone2;

import java.util.Scanner;

public class Absolute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n>0) {
			System.out.println("Absolute value is "+ n);
		}
		else
			System.out.println("Absolute value is "+ (-n));

	}

}
