package milestone12;

import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int p=1,s=0;
		System.out.println("Enter 10 numbers: ");
        int arr[]=new int[10];
        
        for (int i=0;i<10;i++) {
        	arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]>largest)
        		largest=arr[i];
        	if(arr[i]<smallest)
        		smallest=arr[i];
        }
        System.out.println("Largest no. is "+largest+" and Smallest no. is "+smallest);
	}

}
