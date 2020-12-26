package milestone8;

import java.util.Scanner;

public class StarPattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	       System.out.println("Enter no.of rows: ");
	       int n=sc.nextInt();
	       int k;
	       for(int i=1;i<=n;i++)
	       {
	    	   k=1;
	    	   if(i<=5)
	    	   {
	    		   for(int j=1;j<=n-4;j++)
	    		   {
	    			   if(j>=6-i)
	    			   {
	    				   System.out.print(k);
	    				   k++;
	    			   }
	    			   else
	    				   System.out.print(" ");
	    			   
	    		   }
	    	   }
	    	   else 
	    	   {
	    		   k=1;
	    		   for(int j=1;j<=n-4;j++)
	    		   {
	    			   if(j>=i-4)
	    			   {
	    				   
	    				   System.out.print(k);
	    				   k++;
	    			   }
	    			   else
	    				   System.out.print(" ");
	    			   
	    		   }
	    		   
	    	   }
	    	   System.out.println("\n");
	       }
	       
	}

}
