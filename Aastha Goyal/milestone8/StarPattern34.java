package milestone8;

import java.util.Scanner;

public class StarPattern34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	       System.out.println("Enter no.of rows: ");
	       int n=sc.nextInt();
	       int k=1;
	       int p;
	       
	      
	       for(int i=1;i<=n;i++)
	       {
	    	   p=k;
	    	   for(int j=1;j<=i;j++)
	    	   {
	    		 System.out.print(p);  
	    		  p=p-(n-i+j); 
	    		  
	    	   }
	    	   k=k+1+n-i;
	    	   System.out.println("\n");
	    	}
	}

}
