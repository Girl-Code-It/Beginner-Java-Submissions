package milestone17aRecursion;

import java.util.Scanner;

public class CopyString {
	
	static void Copy(char s1[],char s2[],int i) {
	
		 s2[i]=s1[i];
	     if(i==s1.length-1)
		 return;
	 
	 Copy(s1,s2,i+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyString obj=new CopyString();
        char s1[]="Halistone".toCharArray();
        char s2[]=new char[s1.length];
        int i=0;
        Copy(s1,s2,i);
        System.out.println("Real String "+String.valueOf(s1));
        System.out.println("Copied String "+String.valueOf(s2));
	}

}
