package milestone6;

import java.util.Scanner;

public class StrongNumbers1ToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number");
         int n =sc.nextInt();
         
         int fact,m,sum;
         for(int j=1;j<=n;j++)
         {
         sum=0;
         int temp=j;
         while(temp>0)
         {
          fact=1;
         m=temp%10;
         temp/=10;
         for(int i=1;i<=m;i++)
         {
        	 fact*=i;
         }
         sum+=fact;
         }
         if(sum==j)
        	 System.out.println(j+" ");
         
         }
         
	}

}
