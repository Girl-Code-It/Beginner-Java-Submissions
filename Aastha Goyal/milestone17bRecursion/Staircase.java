package milestone17bRecursion;

import java.util.Scanner;

public class Staircase {
	
	static int Steps(int n) {
		if(n<0)
			return 0;
		else if(n==1 || n==0)
			return 1;
		else
			return Steps(n-1)+Steps(n-2)+Steps(n-3);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter no. of staircase: ");
         int n=sc.nextInt();
         int res=Steps(n);
         System.out.println(res);
	}

}
