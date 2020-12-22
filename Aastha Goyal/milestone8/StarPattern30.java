package milestone8;

import java.util.Scanner;

public class StarPattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	       System.out.println("Enter no.of rows: ");
	       int n=sc.nextInt();
	       int k;
	       
	       for(int i=1;i<=3*n;i++)
	       {
	    	  
	    	   for(int j=1;j<=2*n-1;j++)
	    	   {
	    		   if(i<=n)
	    		   {
	    			 if(j>=2*n-i)
	    			 
	    				 System.out.print("*");
	    			 
	    			else
	    				 System.out.print(" ");
	    		   }
	    		  else if(i<=2*n)
	    		  {
	    			  k=0;
	    			  if(j==n)
	    			  { 
	    				  System.out.print("|");
	    			      k=1;
	    			  }
	    			  if(j<=(i-n-1))
	    			  {
	    				  
	    				  System.out.print("*");
	    				  k=1;
	    			  }
	    			  if(j>=i)
	    			  {
	    				  System.out.print("*");
	    				  k=1;
	    			  }
	    			  if(k==0)
	    				  System.out.print(" ");
	    			 
	    		  }
	    		  else if(i<=3*n)
	    		  {
	    			  if(j<=10-i)
		    			 {
		    				 System.out.print("*");
		    			 }
		    			 else
		    				 System.out.print(" "); 
	    		  }
	    			   
	    	   }
	    	   System.out.println("\n");
	       }
	

	}

}
