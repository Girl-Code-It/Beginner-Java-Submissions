//https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-maze-paths-official/ojquestion#

import java.io.*;
import java.util.*;

public class PrintMazePaths {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        printMazePaths (1,1,n,m,"");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if (sr==dr && sc==dc) {
            System.out.println (psf);
        } else if (sr>dr) {
            return;
        } else if (sc>dc) {
            return;
        } else {
            printMazePaths (sr,sc+1,dr,dc,psf+'h');
            printMazePaths (sr+1,sc,dr,dc,psf+'v');
        }
    }

}