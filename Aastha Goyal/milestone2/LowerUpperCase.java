package milestone2;

import java.util.Scanner;

public class LowerUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Character");
        char ch=sc.next().charAt(0);
        if(ch>='A'&& ch<='Z')
        	System.out.println("UpperCase");
        if(ch>='a'&& ch<='z')
        	System.out.println("LowerCase");
        
	}

}
