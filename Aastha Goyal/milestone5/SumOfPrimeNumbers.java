package milestone5;

import java.util.Scanner;

public class SumOfPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n =sc.nextInt();
       int sum=0;
     
        System.out.println("Sum of Prime numbers between 1 to "+n+" is: ");
       for(int j=2;j<=n;j++)
       {
    	   int count=0;
     	   for(int i=1;i<=j;i++)
     	   {
     		   if(j%i==0)
     	         count++;
     		   
     		   
           }
        if(count==2) {
            sum+=j;
        	//System.out.println("Prime Number");
           // System.out.print(sum+" ");
        }
        
	}
       System.out.print(sum+" ");
	}

}
