package milestone8;

import java.util.Scanner;

public class StarPattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	       System.out.println("Enter no.of rows: ");
	       int n=sc.nextInt();
	       int k;
	       for(int i=1;i<=n;i++)
	       {
	    	   k=i;
	    	   for(int j=1;j<=(n+3);j++)
	    	   {
	    		   if(j>=5-i && j<=3+i)
	    		   {
	    			   if(j<n)
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
	    			   System.out.println(" ");
	    	   }
	    	   System.out.println("\n");
	       }
	}

}
