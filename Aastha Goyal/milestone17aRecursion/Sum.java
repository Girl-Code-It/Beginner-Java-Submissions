package milestone17aRecursion;

import java.util.Scanner;

public class Sum {

	int Sum(int n) {
		if(n<=1)
			return n;
		else
		
			return n+Sum(n-1);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        Sum obj=new Sum();
        System.out.println("Enter no. elements: ");
        int n=sc.nextInt();
        System.out.println("Sum of no.'s is : ");
        int result=obj.Sum(n);
        System.out.println(result);
	}

}
