package milestone2;

import java.util.Scanner;

public abstract class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n =sc.nextInt();
		int m=1;
		for(int i=1;i<=10;i++) {
			 m=n*i;
			 System.out.println(m);
			 
		}
		
		
		

	}

}
