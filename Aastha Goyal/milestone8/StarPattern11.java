package milestone8;

import java.util.Scanner;

public class StarPattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	       System.out.println("Enter no.of rows: ");
	       int n=sc.nextInt();
	       int k=0;
       for(int i=1;i<=n;i++)
       {
     	  if(i<=4)
     	  {
     		  k++;
     	      for(int j=1;j<=n-3;j++)
     	      {
     		     if(j<=k)
     				  System.out.print("*");
     		     else
     			      System.out.print(" ");
     	       }
     	      
     	  }
     	  else
     	  {
     		 
     		  k--;
     	      for(int j=1;j<=n;j++)
     	      {
     		     if(j<=k)
     				  System.out.print("*");
     		     else
     			      System.out.print(" ");
     	       }
     	  }
     	  System.out.println("\n");
       }
	}

}
