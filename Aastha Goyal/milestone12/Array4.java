package milestone12;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 10 numbers: ");
        int arr[]=new int[10];
        int rarr[]=new int[10];
        for (int i=0;i<10;i++) {
        	arr[i]=sc.nextInt();
        }
        for (int j=0;j<10;j++) {
        	rarr[j]=arr[9-j];
        }
        for (int j=0;j<10;j++) {
        	System.out.println(rarr[j]);
        }
        
	}

}
