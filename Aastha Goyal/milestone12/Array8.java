package milestone12;

import java.util.Scanner;

public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int arr[]= {1,35,6,7,5,5};
        boolean read=true;
        int j=arr.length-1;
        for(int i=0;i<arr.length/2;i++) {
        	if(arr[i]!=arr[j])
        	{
        		 read=false;
        		break;
        	}
        	else
        		j--;
        }
        System.out.println(read);
        
	}

}
