//https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-permutations-official/ojquestion#

import java.io.*;
import java.util.*;

public class PrintPermutations {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        String s=sc.next();
        
        printpermutations (s,"");

    }

    public static void printpermutations(String str,String ans) {
		if (str.length()==0) {
			System.out.println(ans);
			return;
		}
		for (int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			String ros=str.substring(0,i)+str.substring(i+1);
			
			printpermutations(ros,ans+ch);
		}
	}

}