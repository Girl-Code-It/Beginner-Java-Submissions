//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/min-cost-maze-traversal-official/ojquestion

import java.io.*;
import java.util.*;

public class MinCostInMazeTraversal {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner (System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        
        Integer[][] maze=new Integer[m][n];
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                maze[i][j]=sc.nextInt();
            }
        }
        
        Integer[][] ar=new Integer[m][n];
        Integer cnt=mazePath (0,0,ar,m,n,maze);
        System.out.println (cnt);
    }
    
    static Integer mazePath (int i, int j, Integer[][] ar, int m, int n, Integer[][] maze) {
        if (i==m-1 && j==n-1) {
            return maze[i][j];
        } else if (i==m || j==n) {
            return null;
        } else if (ar[i][j]!=null) {
            return ar[i][j];
        } else {
            Integer x,y;
            
            x=mazePath (i+1,j,ar,m,n,maze);
            if (x!=null) {
                x=x+maze[i][j];
            }
            y=mazePath (i,j+1,ar,m,n,maze);
            if (y!=null) {
                y=y+maze[i][j];
            }
            
            if (x!=null && y!=null) {
                ar[i][j]= Math.min(x,y);
            }else if (x==null) {
                ar[i][j]=y;
            } else {
                ar[i][j]=x;
            }
            
            return ar[i][j];
        }
    }

}