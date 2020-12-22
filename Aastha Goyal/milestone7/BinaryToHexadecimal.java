package milestone7;

import java.util.Scanner;

public class BinaryToHexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter binary number");
		int binnum=sc.nextInt();
		int hexadnum[]=new int[100];
		int decnum=0,i=1,rem;
		System.out.println("Equivalent hexadecimal number of "+binnum+" is: ");
		while(binnum>0)          //binary to decimal
		{
			rem=binnum%10;
			decnum+=rem*i;
			i=i*2;
			binnum/=10;
			
		}
		i=1;
		while(decnum>0)           //decimal to octal
		{
			 hexadnum[i++]= decnum%16;
			  decnum/=16;
			
		}
		
		for(int j=i-1;j>0;j--)
		{
			System.out.print(hexadnum[j]);
		}
	}

}
