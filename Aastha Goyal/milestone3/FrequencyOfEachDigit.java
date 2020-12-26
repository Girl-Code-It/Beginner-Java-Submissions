package milestone3;

import java.util.Scanner;

public class FrequencyOfEachDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           
           System.out.println("Enter a number");
           int n=sc.nextInt();
//           while(n!=0) {
//        	   r=n%10;
//        	   n/=10;
//        	   
//           }
//           switch (r) {
//           case 0:
//        	   
//        	   System.out.println();
//           
//           }
           int[] digitcount=new int[10];
           int lastDigit =n%10;
           digitcount[lastDigit]++;
           n=n/10;
           for(int i=0;i<digitcount.length;i++) {
        	   System.out.println(" "+i+" : "+digitcount[i]);
           }
	}

}
