//https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-maze-path-with-jumps-official/ojquestion#

import java.io.*;
import java.util.*;

public class PrintMazePathsWithJumps {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        printMazePaths (0,0,n,m,"");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if (sr==dr-1 && sc==dc-1) {
            System.out.println (psf);
            return;
        } else if (sr>=dr || sc>=dc) {
            return;
        } else {
            for (int i=1; i<=dc; i++) {
                printMazePaths (sr,sc+i,dr,dc,psf+"h"+i);
            }
            
            for (int i=1; i<=dr; i++) {
                printMazePaths (sr+i,sc,dr,dc,psf+"v"+i);
            }
            
            for (int i=1; i<=dr && i<=dc; i++) {
                printMazePaths (sr+i,sc+i,dr,dc,psf+"d"+i);
            }
        }
    }
}
