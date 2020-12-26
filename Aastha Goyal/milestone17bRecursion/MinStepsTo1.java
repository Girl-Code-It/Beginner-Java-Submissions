package milestone17bRecursion;

import java.util.Scanner;

  

public class MinStepsTo1 {
	
	 static int Steps(int n,int count) {
		 if(n!=1)
			{
		   if(n%2==0) {
			 n=n/2;
			 //count++;
		   }
		   else if(n%3==0) {
			  n=n/3;
			 // count++;
		   }
		    else
		   {
			 n=n-1;
			// count++;
		   }
		 count++;
		   return Steps(n,count);
		 
		 }
		 else //Steps(n,count);
		  return count;
		 
		
	   }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number : ");
        int n=sc.nextInt();
        int count=0;
        int res=Steps(n,count);
        System.out.println(res);
	}

}
