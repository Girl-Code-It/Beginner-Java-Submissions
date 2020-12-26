package milestone7;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Decimal Number ");
        int decnum=sc.nextInt();
        System.out.println("Equivalent Binary Number of "+decnum+" is: ");
        int binnum[]=new int[100];
        int i=1;
        while(decnum>0)
        {
        	binnum[i++]=decnum%2;
        	decnum/=2;
           
        }
       
        for(int j=i-1;j>0;j--)
        {
        	 System.out.print(binnum[j]);
        }
	}

}
