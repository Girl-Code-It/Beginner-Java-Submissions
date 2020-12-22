package milestone5;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n =sc.nextInt();
        int temp=n,cube=0,m;
        while(n>0)
        {
           m=n%10;
           n/=10;
           cube+=(m*m*m);
        }
        if(temp==cube)
        	System.out.println(temp+" is a Armstrong Number");
        else
        	System.out.println(temp+" is not a Armstrong Number");
    
	}

}
