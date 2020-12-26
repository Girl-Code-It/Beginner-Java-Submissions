package milestone12;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
       int arr[]=new int[10];
        for (int i=0;i<10;i++) {
        	arr[i]=sc.nextInt();
        }
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        for(int i=0;i<10;i++)
        {
        	if(arr[i]==n)
        		System.out.println(n+" is present in array.");
        	
        }
	}

}
