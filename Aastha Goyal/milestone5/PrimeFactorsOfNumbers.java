package milestone5;

import java.util.Scanner;

public class PrimeFactorsOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n =sc.nextInt();
        
        for(int i=2;i<=n;i++)
        {
        	if(n%i==0)
        	{
        	   for(int j=2;j<i/2;j++)
        	   {
        		   if(i%j!=0)
        		   {
        	            System.out.println(i+" ");
        		        break;
        		   }
        	   }
        	}
        }
	}

}
