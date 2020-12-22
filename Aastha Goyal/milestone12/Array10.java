package milestone12;

import java.util.Scanner;

public class Array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number if elements: ");
		int n= sc.nextInt();
        int a[]=new int[n];
        int largest=0;
        int smallest=1;
        System.out.println("Enter elements: ");
        for(int i=0;i<a.length;i++) {
        	a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
        	for(int j=a.length;j>=0;j++) {
        		if(i!=j) {
        			if(a[i]-a[j]>largest)
        				largest=a[i]-a[j];
        			if(a[i]-a[j]<smallest)
        				smallest=a[i]-a[j];
        		}
        	}
        }
        System.out.println("Max is "+largest+" Min is "+smallest);
	}

}
