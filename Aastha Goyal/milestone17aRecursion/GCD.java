package milestone17aRecursion;

import java.util.Scanner;

public class GCD {
	int i=1;
	int Gcd(int n,int m) {
		if(n%i==0 && m%i==0)
		{
			return i;		}
		else
		{
			i++;
			return Gcd(n,m);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        GCD obj=new GCD();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Two numbers: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int result=obj.Gcd(n,m);
        System.out.println("GCD of "+n+" and "+m +" is "+result);
	}

}
