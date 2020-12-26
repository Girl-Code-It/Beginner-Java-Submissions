package milestone17aRecursion;

import java.util.Scanner;

public class Palindrome {
	int sum=0;
	int Palindrome(int n) {
		
		if(n!=0) {
			int r=n%10;
		    sum=sum*10+r;
		   return Palindrome(n/10);
			
		}
		else
			return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome obj=new Palindrome();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int res=obj.Palindrome(n);
        if(n==res)
        	System.out.println("Palindrome");
        else
        	System.out.println("Not Palindrome");
        
	}

}
