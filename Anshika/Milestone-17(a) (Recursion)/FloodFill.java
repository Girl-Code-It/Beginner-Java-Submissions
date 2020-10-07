//https://www.pepcoding.com/resources/online-java-foundation/recursion-backtracking/flood-fill-official/ojquestion#

import java.io.*;
import java.util.*;

public class FloodFill {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        int[][] ar=new int[n][m];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                ar[i][j]=sc.nextInt();
            }
        }
        
        boolean[][] br=new boolean[n][m];
        floodfill (ar,0,0,"",br);
    }

    public static void floodfill(int[][] maze, int row, int col, String psf, boolean[][] visited){
        if (row==maze.length-1 && col==maze[0].length-1) {
            System.out.println (psf);
            return;
        } else {
            if (isSafe (maze,row-1,col,visited)) {
                visited[row-1][col]=true;
                floodfill (maze,row-1,col,psf+"t",visited);
                visited[row-1][col]=false;
            }
            if (isSafe (maze,row,col-1,visited)) {
                visited[row][col-1]=true;
                floodfill (maze,row,col-1,psf+"l",visited);
                visited[row][col-1]=false;
            }
            if (isSafe (maze,row+1,col,visited)) {
                visited[row+1][col]=true;
                floodfill (maze,row+1,col,psf+"d",visited);
                visited[row+1][col]=false;
            }
            if (isSafe (maze,row,col+1,visited)) {
                visited[row][col+1]=true;
                floodfill (maze,row,col+1,psf+"r",visited);
                visited[row][col+1]=false;
            }
        }
    }
    
    static boolean isSafe (int[][] maze, int row, int col, boolean[][] visited) {
        if (row<0 || col<0 || row==maze.length || col==maze[0].length) {
            return false;
        }
        if (maze[row][col]==1 || visited[row][col]==true) {
            return false;
        }
        return true;
    } 
}