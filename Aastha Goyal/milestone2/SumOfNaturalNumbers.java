package milestone2;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			
			sum+=i;
			
		}
		System.out.println("Sum is "+sum);

	}

}
