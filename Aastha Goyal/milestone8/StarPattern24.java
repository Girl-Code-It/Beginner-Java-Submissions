package milestone8;

import java.util.Scanner;

public class StarPattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	       System.out.println("Enter no.of rows: ");
	       int n=sc.nextInt();
	       for(int i=1;i<=n;i++)
	       {
	    	   for(int j=1;j<=n;j++)
	    	   {
	    		  if((i==1||i==7||j==1||j==7))
	    			  System.out.print("*");
	    		  else if((i==4) && (j==4))
	    			  System.out.print(" ");
	    		  else if(i>=3&&i<=5&&j>=3&&j<=5)
	    		      System.out.print("*");
	    		  else
	    			  System.out.print(" ");
	    	   }
	    	   System.out.println("\n");
	       }
	}

}
