package milestone2;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Salary");
		int s=sc.nextInt();
		System.out.println("Enter year of Service");
		int y=sc.nextInt();
		if(y>5) {
			System.out.println("You get bonus of 5% "+ "and net bonus amount is "+(s*0.05)+" Total amount you'll get is "+(s+(s*0.05)));
		}
		else {
			System.out.println("No Bonus");
		}
		

	}

}
