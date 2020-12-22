package milestone7;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter binary number");
		int binnum=sc.nextInt();
		int octnum[]=new int[100];
		int decnum=0,i=1,rem;
		System.out.println("Equivalent decimal number of "+binnum+" is: ");
		while(binnum>0)          //binary to decimal
		{
			rem=binnum%10;
			decnum+=rem*i;
			i=i*2;
			binnum/=10;
			
		}
		System.out.println(decnum);
	}

}
