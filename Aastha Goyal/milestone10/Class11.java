package milestone10;

import java.util.Scanner;

public class Class11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        class Employee
        {
        	int salary,numberofhoursperday;
        	public void getInfo(int x,int y)
        	{
        		salary=x;
        		numberofhoursperday=y;
        	}
        	public int addSal()
        	{
        		if(salary>500)
        	        return (10+salary);
        		else
        			return salary;
        	}
        	public int addWork()
        	{
        		if(numberofhoursperday>6)
        			return (5+salary);
        		else 
        			return salary;
        	}
        }
       Scanner sc=new Scanner(System.in);
        Employee e=new Employee();
        System.out.println("Enter Salary in dollars: ");
        int x=sc.nextInt();
        System.out.println("Enter number of hours per day of week: ");
        int y=sc.nextInt();
        e.getInfo(x,y);
        System.out.println("if salary is greater than 500 the new salary  will be: "+e.addSal());
        System.out.println("if number of hours per day of week are greater than 6 , then resultant salary will be: "+e.addWork());
	}

}
