package milestone6;

import java.util.Scanner;

public class PerfectNumber1ToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter a number");
           int n =sc.nextInt();
          // int sum=0;
           for(int j=1;j<=n;j++)
           {
        	   int sum=0;
               for(int i=1;i<j;i++)
               {
           	      if(j%i==0)
                     sum+=i;
               }
              if(sum==j)
                 System.out.println(j+" ");
           } 
	}

}
