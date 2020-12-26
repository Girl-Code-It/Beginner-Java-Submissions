package milestone8;

import java.util.Scanner;

public class StarPattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	       System.out.println("Enter no.of rows: ");
	       int n=sc.nextInt();
	       int k=1;
	       for(int i=1;i<=n;i++)
	       {
	    	   for(int j=1;j<=(n+4);j++)
	    	   {
	    		   if((j>=(6-i)) && (j<=(4+i)) && k==1)
	    			{
	    			  System.out.print("*");
	    			  k=0;
	    		   }
	    		   else
	    			   System.out.print(" ");
	    		   k=1;
	    	   }
	    	   System.out.println("\n");
	       }
	}

}
