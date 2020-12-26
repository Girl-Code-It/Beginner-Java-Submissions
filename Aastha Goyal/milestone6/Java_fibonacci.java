package milestone6;

import java.util.Scanner;

public class Java_fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number of members in series: ");
         int n=sc.nextInt();
         int a=0,b=1,c=1;
         System.out.print(a+"\n "+b+"\n ");
         for(int i=1;i<=n;i++) {
        	 a=b;
        	 b=c;
        	 c=a+b;
        	 System.out.print(c +"\n ");
         }
		
	}

}
