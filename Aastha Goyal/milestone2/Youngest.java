package milestone2;

import java.util.Scanner;

public class Youngest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter three ages");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
	
		if(a>b && a>c) 
			System.out.println("A is oldest");
		
	
		else if(b>a && b>c) 
			System.out.println("B is oldest");
		
		
		else if(c>a && c>b) 
			System.out.println("C is oldest");
		
		if(a<b&&a<c)
			System.out.println("A is Youngest");
		
	    else if(b<a&&b<c)
		System.out.println("B is Youngest");
	    else if(c<a&&c<b)
		System.out.println("C is Youngest");
	}
		

	}


