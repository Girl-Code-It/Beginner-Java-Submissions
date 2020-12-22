package milestone7;

import java.util.Scanner;

public class HexadecimalToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Enter Hexadecimal number");
	        int hexadnum=sc.nextInt();
	     
	        int decnum=0,rem,i=1;
	       
	        System.out.println("Equivalent decimal number of "+hexadnum+" is: ");
	        while(hexadnum>0)        //hexadecimal to decimal 
	        {
	        	rem=hexadnum%10;
	        	decnum+=rem*i;
	        	i*=16;
	        	hexadnum/=10;
	        }
	        System.out.print(decnum);
	       
	}

}
