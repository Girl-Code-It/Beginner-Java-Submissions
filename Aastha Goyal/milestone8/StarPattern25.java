package milestone8;

import java.util.Scanner;

public class StarPattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	       System.out.println("Enter no.of rows: ");
	       int n=sc.nextInt();
	       int k,m;
	       for(int i=0;i<=n;i++)
	       { 
	    	   k=i;
	    	   m=n-i;
	    	   for(int j=0;j<=n;j++)
	    	   {
	    		 if(i<10)
	    		 {
	    			 if(j>=10-i && j<=10+i)
	    			 {
	    				// System.out.print("*");
	    				 if(j<10)
	    				 {
	    				    System.out.print(k%10);
	    				    k++;
	    				 }
	    				 else
	    				 {
	    					 System.out.print(k%10);
	    				     k--;
	    				 }
    				
	    			 }
	    			 else
	    				 System.out.print(" ");
	    		 }
	    		 else
	    		 {
	    			 if(j>=i-10 && j<=30-i)
	    			 {
	    				 if(j<10)
	    				 {
	    				    System.out.print(m%10);
	    				    m++;
	    				 }
	    				 else
	    				 {
	    					 System.out.print(m%10);
	    				     m--;
	    				 }	 
	    			 }
	    			 else
	    				 System.out.print(" ");

	    		 }
	    	   }
	    	   System.out.println("\n");
	       }
	}

}
