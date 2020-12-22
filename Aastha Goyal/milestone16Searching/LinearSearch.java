package milestone16Searching;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {1,2,3,4,5,6,7,8,9,10};
        int flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to be search: ");
        int n=sc.nextInt();
        for(int i=0;i<=arr.length;i++) 
        {
        	if(arr[i]==n) {
        		System.out.println(n +" is present at index "+i);
        		flag=0;
        		break;
        	   }
        	else {
        	 flag=1;
             }
	  }
        if(flag==1)
        	System.out.println(n +"is not present in array.");

}
}
