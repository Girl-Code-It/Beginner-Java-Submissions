package milestone8;

import java.util.Scanner;

public class StarPattern26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	       System.out.println("Enter no.of rows: ");
	       int n=sc.nextInt();
	       
	       for(int i=1;i<=n;i++)
	       {
	    	  
	    	   for(int j=i;j>=1;j--)
	    	   {
	    		   if(j<=i)
	    		       System.out.print((char)(64+j));
	    				
	    		   else
	    			   System.out.print("");
	    	   }
	    	   System.out.println("\n");
	    	   
	       }
	}

}
