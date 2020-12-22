package milestone4;

import java.util.Scanner;

public class LCMOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1=sc.nextInt();
		System.out.println("Enter second number: ");
		int num2=sc.nextInt();
		int max=(num1>num2?num1:num2);
		int i=max;
		int lcm=1;
			while(i>0) {
				 if((i%num1==0)&&(i%num2==0))
				 {
					lcm=i; 
					break; 
				 }
				 i+=max;
				 
			}
			System.out.println("LCM of "+num1+" and "+num2+" is: "+lcm);

	}

}
