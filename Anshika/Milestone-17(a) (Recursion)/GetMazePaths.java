//https://www.pepcoding.com/resources/online-java-foundation/recursion-with-arraylists/get-maze-paths-official/ojquestion#

import java.io.*;
import java.util.*;
import java.util.Collections;

public class GetMazePaths {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        
        ArrayList<String> li=new ArrayList<String>();
        if (m==0 || n==0) {
            System.out.println (li);
            return;
        }
        System.out.println (getMazePaths(1,1,m,n,"",li));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc, String s, ArrayList<String> li) {
        if (sr==dr && sc==dc) {
            li.add(s);
        } else if (sr==dr) {
            getMazePaths (sr,sc+1,dr,dc,s+'h',li);
        } else if (sc==dc) {
            getMazePaths (sr+1,sc,dr,dc,s+'v',li);
        } else {
            getMazePaths (sr,sc+1,dr,dc,s+'h',li);
            getMazePaths (sr+1,sc,dr,dc,s+'v',li);
            
        }

        return li;
    }

}