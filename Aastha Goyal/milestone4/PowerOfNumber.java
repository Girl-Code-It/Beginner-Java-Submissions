package milestone4;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base number: ");
		int base=sc.nextInt();
		int temp=base;
		System.out.println("Enter exponent number: ");
		int exp=sc.nextInt();
		for(int i=1;i<exp;i++) {
			temp=temp*base;
		}
		System.out.println("Result of "+base+" power of "+exp+"is : "+temp);
		

	}

}
