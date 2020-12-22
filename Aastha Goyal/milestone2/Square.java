package milestone2;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length");
		int l=sc.nextInt();
		System.out.println("Enter Breadth");
		int b=sc.nextInt();
		if(l==b) {
			System.out.println("It's a square");
		}
		else
		{
			System.out.println("It's not a square");
		}
		
		

	}

}
