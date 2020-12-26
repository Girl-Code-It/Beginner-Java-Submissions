package milestone8;

import java.util.Scanner;

public class StarPattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	       System.out.println("Enter no.of rows: ");
	       int n=sc.nextInt();
	       char k;
	      
	       for(int i=1;i<=n;i++)
	       {
	    	    k='A';
	    	   for(int j=1;j<=(n+3);j++)
	    	   {
	    		   
	    		   if((j>=(n-i+1)) && (j<=(3+i)) )
	    			{
	    			   if(j<4) 
	    			   {
	    			         System.out.print(k);
	    			         k++;
	    			
	    			  }
	    			   else
	    			   {
	    				   System.out.print(k);
	    				   k--;
	    			   }
	    			}
	    			   
	    		   else
	    		   {
	    			   System.out.print(" ");
	    		       if(j==4)
	    			       k--;
	    		   }
	    		  
	    	  }
	    	   System.out.println("\n");
	    	}
	
	}

}
