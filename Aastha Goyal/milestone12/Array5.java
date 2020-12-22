package milestone12;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		int p=1,s=0;
		System.out.println("Enter 10 numbers: ");
        int arr[]=new int[10];
        
        for (int i=0;i<10;i++) {
        	arr[i]=sc.nextInt();
        }
        for (int i=0;i<10;i++) {
        	p*=arr[i];
        }
        for (int i=0;i<10;i++) {
        	s+=arr[i];
        }
        System.out.println("product of elements is: "+p);
        System.out.println("Sum of elements is: "+s);
	}

}
