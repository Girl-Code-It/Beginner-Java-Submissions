package milestone8;

import java.util.Scanner;

public class StarPattern33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	       System.out.println("Enter no.of rows: ");
	       int n=sc.nextInt();
	       char k;
	       char m;
	      
	       for(int i=1;i<=n;i++)
	       {
	    	    k='A';
	    	    
	    	   for(int j=1;j<=(n+3);j++)
	    	   {
	    		   
	    		   if((j<=(5-i)) || (j>=(3+i)) )
	    			   System.out.print(k);
	    			   
	    		   else
	    		       System.out.print(" ");
	    		  
	    		  k++;
	    	  }
	    	   System.out.println("\n");
	    	}
	}

}
