//https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-subsequence-official/ojquestion#

import java.io.*;
import java.util.*;

public class PrintSubsequence {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        String s=sc.next();
        printSS (s,0);

    }

    public static void printSS(String str, int i) {
        if (i==str.length()) {
            System.out.println (str);
        } else {
            printSS (str,i+1);
            printSS (str.substring(0,i)+str.substring(i+1),i);
        }
    }

}