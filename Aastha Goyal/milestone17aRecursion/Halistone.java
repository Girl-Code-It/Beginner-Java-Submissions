package milestone17aRecursion;

import java.util.Scanner;

public class Halistone {
	
	 static void Halistone(int n) {
		
			if(n!=1) {
				if(n%2==0) 
				  {
					n=n/2;
					System.out.print(n+" ");
				  }
				else
				{
					n=((3*n)+1);
				    System.out.print(n+" ");
				    
				}
				 Halistone(n);
			}
			
				
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Halistone obj=new Halistone();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        System.out.print(n+" ");
        Halistone(n);
       
	}

}
