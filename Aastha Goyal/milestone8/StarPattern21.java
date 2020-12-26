package milestone8;

import java.util.Scanner;

public class StarPattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	       System.out.println("Enter no.of rows: ");
	       int n=sc.nextInt();
// 
	       for(int i=1;i<=n;i++)
	       {
	    	   for(int j=1;j<=n+4;j++)
	    	   {
	    		 if(j>=5-i && j<=9-i)  
	    			 System.out.print("*");
	    		 else
	    			 System.out.print(" ");
	    	   }
	    	   System.out.println("\n");
	       }
	}

}
