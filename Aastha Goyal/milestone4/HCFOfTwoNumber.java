package milestone4;

import java.util.Scanner;

public class HCFOfTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1=sc.nextInt();
		System.out.println("Enter second number: ");
		int num2=sc.nextInt();
		int s=1;
			for(int i=1;i<=(num1>num2?num1:num2);i++) {
		              if((num1%i==0)&&(num2%i==0)){
		            	  s=i;
		              }
			}
			System.out.println("HCF of "+num1+" and "+num2+" is: "+s);
	}

}
