package milestone17aRecursion;

import java.util.Scanner;

public class DecimalToBinary {
	int bin=0,fctr=1,r=1;
	int DecimalToBinary(int dec) {
		if(dec!=0) {
			r=dec%2;
			bin=bin+r*fctr;
			fctr*=10;
		    DecimalToBinary(dec/2);
		}
		return bin;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalToBinary obj=new DecimalToBinary();
		Scanner sc=new Scanner(System.in);
		int dec=sc.nextInt();
	    int result=obj.DecimalToBinary(dec);
	    System.out.println(result);
		
	}

}
