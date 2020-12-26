package milestone17aRecursion;

import java.util.Scanner;

public class Factorial {
	int Fac(int n) {
		if(n<=1)
			return n;
		else
		
			return n*Fac(n-1);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        Factorial obj=new Factorial();
        System.out.println("Enter the element ");
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" is : ");
        int result=obj.Fac(n);
        System.out.println(result);
	}

}
