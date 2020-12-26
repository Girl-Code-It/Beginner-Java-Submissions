package milestone8;

import java.util.Scanner;

public class StarPattern35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	       System.out.println("Enter no.of rows: ");
	       int n=sc.nextInt();
	       int k;
	       int m=1;
	       for(int j=1;j<=n;j++)
	       {
	    	   k=0;
	    	   if(j<4-k)
	    		   System.out.print(" ");
	    	   else
	    	   {
	    		   if(m==1)
	    		   System.out.print("*");
	    		   else
	    			   System.out.print(" ");
	    		   m=1-m;
	    	   }
	    	 if(j==4+k)
	    	   {
	    		 k++;
	    		   System.out.print("\n");
	    		   
	    		   j=0;
	    		   m=1;
	    	   }
	    	 System.out.println("\n");
	       }
	}

}
