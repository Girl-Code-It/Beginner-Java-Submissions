package milestone2;

import java.util.Scanner;

public class MedicalAttendence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Number if Classes held");
		int c=sc.nextInt();
		System.out.println("Number if Classes attended");
		int a=sc.nextInt();
		System.out.println("Medical Cause");
	    char y=sc.next().charAt(0);
		double p=(c*0.75);
		if(a<p) {
			System.out.println("Not Allowed to sit in exam");
		}
		else {
			if(y=='Y')
			System.out.println("Medical cause, So not ALlowed to sit in exam");
			else
				System.out.println("Allowed to sit in exam");
		}

	}

	}


