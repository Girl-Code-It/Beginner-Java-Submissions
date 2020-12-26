package milestone8;

import java.util.Scanner;

public class StarPattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	       System.out.println("Enter no.of rows: ");
	       int n=sc.nextInt();
           char k;
           int m;
	       for(int i=1;i<=n;i++)
	       {
	    	   k='A';
	    	   m=1;
	    	   for(int j=1;j<=n+4;j++)
	    	   {
	    		 if(j>=5-i && j<=4+i)  
	    		 {
	    			 if(j<=4)
	    			 {
	    				System.out.print(k); 
	    				k++;
	    			 }
	    			 else
	    			 {
	    				System.out.print(m); 
	    				m++;
	    			 }
	    		 }
	    		 else
	    			 System.out.print(" ");
	    	   }
	    	   System.out.println("\n");
	       }
	}

}
