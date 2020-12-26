package milestone8;

import java.util.Scanner;

public class StarPattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	       System.out.println("Enter no.of rows: ");
	       int n=sc.nextInt();
	       char k=64;
	       for(int i=1;i<=n;i++)
	       {
	    	   k=(char)(k+2*(i-1)+1);
	    	   for(int j=1;j<=n;j++)
	    	   {
	    		   if(j>=(6-i))
	    			   System.out.print(k--);
	    		      
	    		   else
	    			   System.out.print(" ");
	    	   }
	    	   System.out.println("\n");
	       }
	}
}


