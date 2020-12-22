package milestone16Searching;

import java.util.Scanner;

public class NextAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        char a[]= {'a','b','c','d','f','h','k'};
        char x='b';
        char k;
        int l=0,r=a.length,mid;
        while(l<=r) {
        	mid=(l+r)/2;
        	if(a[mid]==x) {
        		System.out.println("Next alaphabet after "+x+" is "+a[mid+1]);
        		break;
        	}
        	else if(a[mid]>x) {
        		k=a[mid];
        		r=mid-1;
        	}
        	else {
        		l=mid+1;
        	}
        		
        }
        
	}

}
