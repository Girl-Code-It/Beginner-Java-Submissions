package milestone2;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter  quantity");
		int n=sc.nextInt();
		if((n*100)>1000) {
			System.out.println("You get a discount of "+ (n*100*0.1)+" and your total cost is"+( n*100-(n*100*0.1)));
		}
		else 
		{
			System.out.println("No Discount");
		}

	}

}
