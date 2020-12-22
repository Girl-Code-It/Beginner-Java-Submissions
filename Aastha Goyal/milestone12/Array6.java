package milestone12;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter 9 numbers: ");
        int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
        
        for (int i=0;i<3;i++) {
        	for(int j=0;j<3;j++)
        	{
        		System.out.print(arr[i][j]);
        		count++;
        		if(count==3) {
        			System.out.println("\n");
        			count=0;
        		}
        	}
        	
        }
	}

}
