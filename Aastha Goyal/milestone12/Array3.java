package milestone12;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int p=0,n=0,o=0,e=0,z=0;
		System.out.println("Enter 20 numbers: ");
       int arr[]=new int[20];
        for (int i=0;i<20;i++) {
        	arr[i]=sc.nextInt();
        }
        for (int i=0;i<20;i++) {
        	if(arr[i]>0)
        		p++;
        	if(arr[i]<0)
        		n++;
        	if(arr[i]%2==0)
        		e++;
        	if(arr[i]%2!=0)
        		o++;
        	if(arr[i]==0)
        		z++;
            }
        System.out.println("Number of positive numbers are: "+p);
        System.out.println("Number of negative numbers are: "+n);
        System.out.println("Number of even numbers are: "+e);
        System.out.println("Number of odd numbers are: "+o);
        System.out.println("Number of zeroes are: "+z);
            
        
        
	}
   
}
