package milestone2;

import java.util.Scanner;

public class ReverseNatural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int i=n;
	       while(i>=1) {
            System.out.println(i);
		    i--;
	       }
	}

}
