package milestone8;

import java.util.Scanner;

public class StarPattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	       System.out.println("Enter no.of rows: ");
	       int n=sc.nextInt();
	       int k=7;
	       for(int i=1;i<=n;i++)
	       {
	    	   for(int j=1;j<=(n+3);j++)
	    	   {
	    		   if(j>=i && j<=k)
	    			   System.out.print("*");
	    		   else
	    			   System.out.print(" ");
	    		   
	    		
	    	   }
	    	   k--;
	    	   System.out.println("\n");
	       }
	}

}
