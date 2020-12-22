package milestone7;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a decimal Number");
		int decnum=sc.nextInt();
		int octnum[]=new int[100];
		int i=1;
		while(decnum>0)           //decimal to octal
		{
			octnum[i++]=decnum%8;
			decnum/=8;
			
		}
		
		for(int j=i-1;j>0;j--)
		{
			System.out.print(octnum[j]);
		}
	}

}
