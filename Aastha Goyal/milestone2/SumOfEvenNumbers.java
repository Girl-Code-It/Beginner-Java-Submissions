package milestone2;

import java.util.Scanner;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			
			sum+=i;
			i+=2;
			
		}
		System.out.println("Sum is "+sum);
	}

}
