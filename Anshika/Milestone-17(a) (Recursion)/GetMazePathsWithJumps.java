//https://www.pepcoding.com/resources/online-java-foundation/recursion-with-arraylists/get-maze-path-with-jumps-official/ojquestion#

import java.io.*;
import java.util.*;
import java.util.Collections;

public class GetMazePathsWithJumps {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        
        ArrayList<String> li=new ArrayList<String>();
        li=getMazePaths(0,0,m,n,"",li);
        System.out.println (li);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc, String psf, ArrayList<String> li) {
        if (sr==dr-1 && sc==dc-1) {
            li.add (psf);
            return li;
        } else if (sr>=dr || sc>=dc) {
            return li;
        } else {
            for (int i=1; i<=dc; i++) {
                getMazePaths (sr,sc+i,dr,dc,psf+"h"+i,li);
            }
            
            for (int i=1; i<=dr; i++) {
                getMazePaths (sr+i,sc,dr,dc,psf+"v"+i,li);
            }
            
            for (int i=1; i<=dr && i<=dc; i++) {
                getMazePaths (sr+i,sc+i,dr,dc,psf+"d"+i,li);
            }
        }

        return li;
    }

}