package milestone17aRecursion;

import java.util.Scanner;

public class Power {
	int i=0,mul=1;
           int Power(int n,int p) {
        	   if(i!=p) {
        		   mul=mul*n;
        		   i++;
        		   return Power(n,p);
        	   }
        	   else
        		   return  mul;
           }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Power obj=new Power();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("Enter power of a number: ");
        int p=sc.nextInt();
        int res=obj.Power(n,p);
        System.out.println("Power "+p+" of a number "+n+" is : "+res);
       
        
	}

}
