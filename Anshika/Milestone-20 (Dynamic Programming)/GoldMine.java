//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/goldmine-official/ojquestion

import java.io.*;
import java.util.*;

public class GoldMine {

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
        Integer[] br=new Integer[m];
        
        for (int i=0; i<m; i++) {
            br[i]=mazePath (maze,ar,i,0,m,n);
        }
        
        int max=0;
        for (int i=0; i<m; i++) {
            if (br[i]>max) {
                max=br[i];
            }
        }
        System.out.println (max);
    }
    
    static Integer mazePath (Integer[][] maze, Integer[][] ar, int i, int j, int m, int n) {
        if (i<0 || i==m || j==n) {
            return null;
        } else if (j==n-1) {
            return maze[i][j];
        } else if (ar[i][j]!=null) {
            return ar[i][j];
        } else {
            Integer x,y,z;
            
                
            x=mazePath(maze,ar,i-1,j+1,m,n);
            if (x!=null) {
                x=x+maze[i][j];
            }
            y=mazePath(maze,ar,i,j+1,m,n);
            if (y!=null) {
                y=y+maze[i][j];
            }
            z=mazePath(maze,ar,i+1,j+1,m,n);
            if (z!=null) {
                z=z+maze[i][j];
            }
            
            if (x!=null && y!=null && z!=null) {
                ar[i][j]=Math.max(x,Math.max(y,z));
            } else if (x==null && y!=null && z!=null) {
                ar[i][j]=Math.max(y,z);
            } else if (y==null && x!=null && z!=null) {
                ar[i][j]=Math.max(x,z);
            } else if (z==null && x!=null && y!=null) {
                ar[i][j]=Math.max(y,x);
            } else if (x!=null) {
                ar[i][j]=x;
            } else if (y!=null) {
                ar[i][j]=y;
            } else if (z!=null){
                ar[i][j]=z;
            }
            
            
            
            
            return ar[i][j];
        }
    }

}