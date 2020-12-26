package milestone8;

import java.util.Scanner;

public class StarPattern36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	       System.out.println("Enter no.of rows: ");
	       int n=sc.nextInt();
	       int k;
	      
	       for(int i=0;i<=n;i++)
	       {
	    	   
	          for(int j=0;j<=n;j++)
	           {
	        	  k=i*j;
	    	     if((j>=0) && (j<=i))
	    	    	 System.out.print(k);
	    	     else
	    	    	 System.out.print(" ");
	           }
	       
	    	 System.out.println("\n");
	       }
	}

}
