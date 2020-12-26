package milestone3;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int r,sum=0,temp=0;
        n=temp;
        while(n!=0) {
        	r=n%10;
        	n/=10;
        	sum=(sum*10)+r;
        }
        if(temp==sum)
        	System.out.println("Palindrome Number");
        else
        	System.out.println("Not a Palindrome Number");
        	
        
	}

}
