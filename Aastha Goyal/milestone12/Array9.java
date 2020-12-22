package milestone12;

import java.util.Scanner;

public class Array9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int p=1,s=0;
		System.out.println("Enter 10 numbers: ");
        int a[]=new int[10];
        for(int i=0;i<a.length;i++) {
        	a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length/2;i++) {
        	System.out.print(a[i]);
        }
        System.out.println("\n");
        for(int i=a.length/2;i<a.length;i++) {
        	System.out.print(a[i]);
        }
	}

}
