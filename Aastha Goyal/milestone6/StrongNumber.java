package milestone6;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number");
         int n =sc.nextInt();
         int temp=n;
         int fact,m,sum=0;
         while(n>0)
         {
          fact=1;
         m=n%10;
         n/=10;
         for(int i=1;i<=m;i++)
         {
        	 fact*=i;
         }
         sum+=fact;
         }
         if(sum==temp)
        	 System.out.println(temp+" is a Strong Number");
         else
        	 System.out.println(temp+" is not a Strong Number");
         
	}

}
