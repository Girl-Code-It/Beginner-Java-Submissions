package milestone17bRecursion;

import java.util.Scanner;

public class TowerOfHanoi {
	
	 static void solve(int n,int s,int d,int h) {
	
		if(n==1) {
			System.out.println("Moving disk "+n+" from "+s+" to "+d);
		  return;
		}
		else {
		  solve(n-1,s,h,d);
		System.out.println("Moving disk "+(n)+" from "+s+" to "+d);
		
		solve(n-1,h,d,s);
		return;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter No. of disks: ");
      int n=sc.nextInt();
      int s=1,h=2,d=3;
      solve(n,s,d,h);
	}

}
