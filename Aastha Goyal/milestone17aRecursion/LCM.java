package milestone17aRecursion;

import java.util.Scanner;

public class LCM {
	int k=0;
	
	int Lcm(int n,int m) {
		
		 k+=m;
		if(k%n==0 && k%m==0)
			return k;
		else
		{
			Lcm(n,m);
		}
		return k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LCM obj=new LCM();
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two number: ");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int result=obj.Lcm(n,m);
		System.out.println(result);
	}

}
