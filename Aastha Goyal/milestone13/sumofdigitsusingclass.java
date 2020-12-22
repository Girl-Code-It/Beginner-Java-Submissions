package milestone13;

import java.util.Scanner;

public class sumofdigitsusingclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int sum=0;
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(sum(x));
	}



	public static int sum(int x) {
		if((x/10)==0) {
			return x;
		}
		else {
			return sum((x/10)+(x%10));
		}
		 
	}
	
}

