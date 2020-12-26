package milestone8;

import java.util.Scanner;

public class StarPattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	       System.out.println("Enter no.of rows: ");
	       int n=sc.nextInt();
	       int k=0;
	       int m=0,p;
	       for(int i=1;i<=n;i++)
	       {
	    	   if(i%2==1)
	    		   m=m+1;
	    	   else {
	    		   m--;
	    		   m=m+i;
	    	   }
	    	   p=m;
	    	   for(int j=1;j<=(n+4);j++)
	    	   {
	    		  if(j>=1 && j<=i+k)
	    		  {
	    			 if(j%2==0)
	    				 System.out.print("*");
	    			 else
	    			 {
	    				 System.out.print(p);
	    			     if(i%2!=0)
	    			     {
	    			    	 p++;m++;
	    			     }
	    			     else
	    			     {
	    			    	 p--;
	    			     }
	    			 }
	    		  }
	    		  else
	    			  System.out.println(" ");
	    	   }
	    	   System.out.println("\n");
	    	   k++;
	       }
	
	}

}
