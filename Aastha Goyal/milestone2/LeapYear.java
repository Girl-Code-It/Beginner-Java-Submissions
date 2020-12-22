package milestone2;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year");
		int y=sc.nextInt();
		boolean leap=false;
		if(y%4==0) {
			if(y%100==0) {
				if(y%400==0)
					leap=true;
				else
					leap =false;
			}
			else 
				leap=false;
			
		}
		else
			leap=false;
		if(leap==true) {
			System.out.println(y+" is a Leap Year");
		}
		else
			System.out.println(y+" is a not Leap Year");

	}

}
