package milestone17aRecursion;

import java.util.Scanner;

public class FibonacciSeries {

	
	static int Fib(int n) {
		if(n<=1)
			return n;
		else
		{
			return Fib(n-1)+Fib(n-2);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		FibonacciSeries obj=new FibonacciSeries();
        System.out.println("Enter the no. of element in series: ");
        int n=sc.nextInt();
        System.out.println("Fibonacci series is: ");
        for(int i=0;i<=n;i++) {
        	System.out.print(Fib(i));
        }
       
	
	}

}
