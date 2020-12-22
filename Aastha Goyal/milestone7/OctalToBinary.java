package milestone7;

import java.util.Scanner;

public class OctalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter octal number");
        int octnum=sc.nextInt();
        int decnum=0,binnum,rem,i=1;
        System.out.println("Equivalent Binary Number of "+octnum+" is: ");
        while(octnum>0)         //octal to decimal
        {
        	rem=octnum%10;
        	decnum+=rem*i;
        	i*=8;
        	octnum/=10;
        }
       
        while(decnum>0)  //decimal to binary
        {
        	binnum=decnum%2;
        	decnum/=2;
        	System.out.print(binnum);
        }
        
        
	}

}
