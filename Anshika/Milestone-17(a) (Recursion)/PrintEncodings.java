//https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-encodings-official/ojquestion#

import java.io.*;
import java.util.*;

public class PrintEncodings {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        String s=sc.next();
        printEncodings (s,0,"");
    }

    public static void printEncodings(String s, int i, String ss) {
        if (i==s.length()) {
            System.out.println (ss);
        } else {
            int n=(int)s.charAt(i)-48;
            if (n==0) {
               return;
            }
            char ch=(char)(n+96);
            printEncodings (s,i+1,ss+ch);
            if (i<s.length()-1) {
                n=Integer.valueOf(s.substring(i,i+2));
                if (n<=26) {
                    ch=(char)(n+96);
                    printEncodings (s,i+2,ss+ch);
                }
            }
            
        }
    }

}