package milestone8;

import java.util.Scanner;

public class StarPattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc= new Scanner(System.in);
	       System.out.println("Enter no.of rows: ");
	       int n=sc.nextInt();
	       for(int i=1;i<=n;i++)
	       {
	    	   for(int j=1;j<=n;j++)
	    	   {
	    		   if(j<=i)
	    		   {
	    			   if(j%2!=0)
	    				   System.out.print(1);
	    			   else
	    				   System.out.print(0);
	    		   }
	    		   else
	    			   System.out.print("");
	    	   }
	    	   System.out.println("\n");
	       }
	}

}
