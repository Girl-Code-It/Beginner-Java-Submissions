//https://www.pepcoding.com/resources/online-java-foundation/recursion-with-arraylists/get-subsequence-official/ojquestion#

import java.io.*;
import java.util.*;
import java.util.Collections;

public class GetSubsequence {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        String s=sc.next();
        
        ArrayList<String> li=new ArrayList<String>();
        li=gss(s,0,li);
        System.out.println (li);
    }

    public static ArrayList<String> gss(String s, int i, ArrayList<String> li) {
        if (i==s.length()) {
            li.add(s);
        } else {
            
            gss (s.substring(0,i)+s.substring(i+1), i, li);
            gss (s,i+1,li);
        }
        return li;
    }

}