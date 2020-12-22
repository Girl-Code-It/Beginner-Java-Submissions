package milestone10;

import java.util.Scanner;

public class Class7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        class Area
        {
        	int length;
        	int breadth;
        	
        	Area(int x,int y)
        	{
        		length=x;
        		breadth=y;
        		
        	}
        	public double returnArea()
        	{
        		return length*breadth;
        	}
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length: ");
        int x=sc.nextInt();
        System.out.println("Enter Breadth: ");
        int y=sc.nextInt();
        Area s= new Area(x,y);
       
        System.out.println("Area is "+s.returnArea());
	}

}
