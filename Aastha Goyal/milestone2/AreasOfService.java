package milestone2;

import java.util.Scanner;

public class AreasOfService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter Your Age");
     int a=sc.nextInt();
     System.out.println("Enter Your Sex");
     char s=sc.next().charAt(0);
     System.out.println("Enter Your Marital Staus");
     char m=sc.next().charAt(0);
     if (s=='F') {
    	 System.out.println("Then she will work only in urban areas.");
     }
     else
     {
    	 if(a>=20&&a<=40)
    		 System.out.println("he may work in anywhere" );
    	 if(a>40&&a<=60)
    		 System.out.println("he will work in urban areas only.");
    	 else
    		 System.out.println("ERROR");
    		 		
     }
	}

}
