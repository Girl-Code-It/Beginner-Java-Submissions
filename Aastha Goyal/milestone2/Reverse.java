package milestone2;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	   
		 System.out.println("Enter number");
		int[] a=new int[5];
		for(int i=0;i<5;i++) {
			int number=sc.nextInt();
			a[i]=number;
		}
		
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
		
		
		

	}

}
