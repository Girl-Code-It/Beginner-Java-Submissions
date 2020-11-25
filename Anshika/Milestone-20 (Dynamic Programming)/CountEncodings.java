//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/count-encodings-official/ojquestion

import java.io.*;
import java.util.*;

public class CountEncodings {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        String s=sc.next();
        
        int cnt=countEncodings(s,0);
        System.out.println (cnt);
    }
    
    static int countEncodings (String s, int i) {
        if (i==s.length()) {
            return 1;
        } else {
            int n=(int)s.charAt(i)-48;
            if (n==0) {
               return 0;
            }
            
            int x=0, y=0;

            x=countEncodings (s,i+1);
            if (i<s.length()-1) {
                n=Integer.valueOf(s.substring(i,i+2));
                if (n<=26) {
                    y=countEncodings (s,i+2);
                }
            }
            
            return x+y;
            
        }
    }
}