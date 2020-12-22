package milestone8;

import java.util.Scanner;

public class StarPattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	       System.out.println("Enter no.of rows: ");
	       int n=sc.nextInt();
	       int k;
	       for(int i=1;i<=n;i++)
	       {
	    	   k=i;
	    	   for(int j=1;j<=(n+4);j++)
	    	   {
	    		   if((j>=(6-i)) && (j<=(4+i)))
	    		   {
	    			 if(j<=4)
	    			 {
	    				System.out.print(k); 
	    				k--;
	    			 }
	    			 else {
	    				 
	    				 System.out.print(k);
	    				 k++;
	    			 }
	    		   }
	    		   else
	    			   System.out.print(" ");
	    	   }
	    	   System.out.println("\n");
	       }
	
	}

}
