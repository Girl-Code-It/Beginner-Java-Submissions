package milestone8;

import java.util.Scanner;

public class StarPattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	       System.out.println("Enter no.of rows: ");
	       int n=sc.nextInt();
	       int k;
	       for(int i=0;i<=n;i++)
	       {
	    	   k=6-i;
	    	   for(int j=0;j<=n;j++)
	    	   {
	    		   if(j<=6-i)
	    		   {
	    			   System.out.print(k);
	    		       k--;
	    	        }
	    		   else
	    			   System.out.print(" ");
	    	   }
	    	   System.out.println("\n");
	       }
	}

}
