package milestone2;

import java.util.Scanner;

public class Attendence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Number if Classes held");
		int c=sc.nextInt();
		System.out.println("Number if Classes attended");
		int a=sc.nextInt();
		double p=(c*0.75);
		if(a<p) {
			System.out.println("Not Allowed to sit in exam");
		}
		else
			System.out.println("ALlowed to sit in exam");
		
		

	}

}
