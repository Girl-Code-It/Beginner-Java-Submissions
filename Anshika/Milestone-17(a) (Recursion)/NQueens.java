//https://www.pepcoding.com/resources/online-java-foundation/recursion-backtracking/n-queens-official/ojquestion#

import java.io.*;
import java.util.*;

public class NQueens {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[][] chess=new int[n][n];
        printNQueens (chess,"",0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        if (row==chess.length) {
            System.out.println (qsf+".");
            return;
        } else {
            for (int i=0; i<chess.length; i++) {
                if (isSafe(chess,row,i)) {
                    chess[row][i]=1;
                    String s=Integer.toString(row);
                    String n=Integer.toString(i);
                    String nn=s+"-"+n+", ";
                    printNQueens (chess,qsf+nn,row+1);
                    chess[row][i]=0;
                }
            }
            return;
        }
    }
    
    static boolean isSafe (int[][] chess, int i, int j) {
        for (int k=0; k<chess.length; k++) {
            if (chess[k][j]==1) {
                return false;
            }
        }
        
        int x=i-1; 
        int y=j-1;
        while (x!=-1 && y!=-1) {
            if (chess[x][y]==1) {
                return false;
            }
            x--;
            y--;
        }
        
        x=i+1;
        y=j+1;
        while (x!=chess.length && y!=chess.length) {
            if (chess[x][y]==1) {
                return false;
            }
            x++;
            y++;
        }
        
        x=i-1;
        y=j+1;
        while (x!=-1 && y!=chess.length) {
            if (chess[x][y]==1) {
                return false;
            }
            x--;
            y++;
        }
        
        x=i+1;
        y=j-1;
        while (x!=chess.length && y!=-1) {
            if (chess[x][y]==1) {
                return false;
            }
            x++;
            y--;
        }
        
        return true;
    } 
}