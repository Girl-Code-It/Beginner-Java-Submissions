//https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-kpc-official/ojquestion#

import java.io.*;
import java.util.*;

public class PrintKPC {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        String s=sc.next();
        
        String[] ar={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
        printKPC(s,0,ar,0,"");
    }

    public static void printKPC(String s,int i, String[] ar, int j, String ss) {
        if (i==s.length()) {
            System.out.println (ss);
        } else {
            int n=(int)s.charAt(i)-48;
            if (j==ar[n].length()) {
                return;
            } else {
                char ne=ar[n].charAt(j);
                printKPC (s,i+1,ar,0,ss+ne);
                printKPC (s,i,ar,j+1,ss);
            }
        }
    }

}