//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/count-a+b+c+subsequences-official/ojquestion

import java.io.*;
import java.util.*;

public class CountAbcSubsequences {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        String s=sc.next();
        
        int cnt=subsequences (s,0);
        System.out.println (cnt);
    }
    
    static int subsequences (String s, int i) {
        if (i==s.length()) {
            if (check(s)) {
                return 1;
            }
            return 0;
        } else {
            return subsequences (s,i+1) + subsequences (s.substring(0,i)+s.substring(i+1),i);
        }
    }
    
    static boolean check (String s) {
        if (s.isEmpty() || s.length()<3) {
            return false;
        }
        int i=0;
        while (i<s.length() && s.charAt(i)=='a') {
            i++;
        }
        if (i==0 || i==s.length()) {
            return false;
        }
        int j=i;
        while (j<s.length() && s.charAt(j)=='b') {
            j++;
        }
        if (j==i || j==s.length()) {
            return false;
        }
        int k=j;
        while (k<s.length() && s.charAt(k)=='c') {
            k++;
        }
        if (k==j || k!=s.length()) {
            return false;
        }
        return true;
    }
}