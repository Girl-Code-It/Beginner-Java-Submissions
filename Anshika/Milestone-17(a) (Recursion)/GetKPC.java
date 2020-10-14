//https://www.pepcoding.com/resources/online-java-foundation/recursion-with-arraylists/get-kpc-official/ojquestion#

import java.io.*;
import java.util.*;
import java.util.Collections;

public class GetKPC {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        String s=sc.next();
        
        String[] ar={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
        ArrayList<String> li=new ArrayList<String>();
        li=getKPC(s,0,ar,0,"",li);
        System.out.println (li);
    }

    public static ArrayList<String> getKPC(String s,int i, String[] ar, int j, String ss, ArrayList<String> li) {
        if (i==s.length()) {
            li.add(ss);
        } else {
            int n=(int)s.charAt(i)-48;
            if (j==ar[n].length()) {
                return li;
            } else {
                char ne=ar[n].charAt(j);
                getKPC (s,i+1,ar,0,ss+ne,li);
                getKPC (s,i,ar,j+1,ss,li);
            }
        }
        return li;
    }

}