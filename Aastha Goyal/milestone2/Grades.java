package milestone2;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks");
		int m=sc.nextInt();
		
		if(m<25)
		     System.out.println("Grade: F");
		else if(m>25 && m<45)
		     System.out.println("Grade: E");
		else if(m>45 && m<50)
		     System.out.println("Grade: D");
		else if(m>50 && m<60)
		     System.out.println("Grade: C");
		else if(m>60 && m<80)
		     System.out.println("Grade: B");
		else 
		     System.out.println("Grade: A");
		
		

	}

}
