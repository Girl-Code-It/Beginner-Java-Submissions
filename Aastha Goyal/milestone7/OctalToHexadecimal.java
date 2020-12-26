package milestone7;

import java.util.Scanner;

public class OctalToHexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Enter octal number");
	        int octnum=sc.nextInt();
	        int hexadnum=0,decnum=0,rem,i=1;
	        System.out.println("Equivalent hexadecimal Number of "+octnum+" is: ");
	        while(octnum>0)         //octal to decimal
	        {
	        	rem=octnum%10;
	        	decnum+=rem*i;
	        	i*=8;
	        	octnum/=10;
	        }
	       
	        while(decnum>0)  //decimal to hexadecimal
	        {
	        	hexadnum=decnum%16;
	        	decnum/=16;
	        	System.out.print(hexadnum);
	        }
	        
	}

}
