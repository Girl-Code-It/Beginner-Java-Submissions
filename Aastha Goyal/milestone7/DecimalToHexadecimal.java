package milestone7;

import java.util.Scanner;

public class DecimalToHexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a decimal Number");
		int decnum=sc.nextInt();
		int hexadnum[]=new int[100];
		int i=1;
		System.out.println("Equivalent hexadecimal number of decnum is: ");
		while(decnum>0)           //decimal to octal
		{
	        hexadnum[i++]=decnum%16;
			decnum/=16;
			
		}
		
		for(int j=i-1;j>0;j--)
		{
			System.out.print(hexadnum[j]);
		}
	}

}
