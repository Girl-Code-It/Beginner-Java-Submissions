package milestone8;

import java.util.Scanner;

public class StarPattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	       System.out.println("Enter no.of rows: ");
	       int n=sc.nextInt();
	       int k,m;
	       char l;
	       for(int i=1;i<=n;i++)
	       {
	    	   
	       k=1;
	       m=1;
	       l='A';
	    	   for(int j=1;j<=n;j++)
	    	   {
	    		   if(j>=(5-i) && j<=3+i)
	    		   {
	    			   if(i%2!=0)
	    			   {
	    			   System.out.print(m);
	    			   m++;
	    			   }
	    			   else {
	    				   System.out.print(l);
	    				   l++;
	    			   }
	    		       k=0;
	    		   }
	    		  if(k==0)
	    			  System.out.print(" ");
	    		 
	    		   else
	    			   System.out.print(" ");
	    	   }
	    	   System.out.println("\n");
	       }
	}

}
