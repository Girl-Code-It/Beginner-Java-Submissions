package milestone5;

import java.util.Scanner;

public class ArmstrongNumberBTW1ToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n =sc.nextInt();
        int temp,cube=0,m;
        for(int i=1;i<=n;i++)        //number
        {
        	  temp=i;
              while(temp>0)           
             {
                 m=temp%10;
                 temp/=10;
                 cube+=(m*m*m);
             }
        
                    if(cube==i)
                      	System.out.println(i+" ");
                cube=0;
                   
        }
	}

}
