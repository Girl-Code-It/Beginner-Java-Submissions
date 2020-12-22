package milestone5;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n =sc.nextInt();
        int count=0;
       
//       for(int i=1;i<=n;i++) {
//    	   if(n%i==0)
//    		   count++;
//       }
//        if(count==2)
//        	System.out.println("Prime Number");
//        else
//        	System.out.println("Not a Prime Number");
//	}
//
//}
                  //OR
       if(n==0||n==1)
	           System.out.println(n+" is not a prime number");
       else {
       for(int i=2;i<=n/2;i++)
       {
    	   if(n%i==0) {
    		  System.out.println(n+" is not a prime number");
    	      count=1;
    	      break;
    	   }
    	   
    	}
       if(count==0)
    	   System.out.println(n+"is a prime number");
             }
	}
}






















