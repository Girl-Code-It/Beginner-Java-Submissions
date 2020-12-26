package milestone7;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n=sc.nextInt();
        int i,j,k,r,ncr,s;
        for(i=0;i<=n;i++)
        {
        	k=1;
        	r=0;
        	for(s=0;s<(n-i);s++)
        	{
        		System.out.print(" ");
        	}
        	ncr=1;
        	for( j=0;j<=i;j++)
        	{
        		System.out.print(" "+ncr);
        		ncr=ncr*(i-j)/(j+1);
     		
        	}
        	System.out.print("\n");
        }
	}

}
