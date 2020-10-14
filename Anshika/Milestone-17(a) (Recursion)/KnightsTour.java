//https://www.pepcoding.com/resources/online-java-foundation/recursion-backtracking/knights-tour-official/ojquestion#

import java.io.*;
import java.util.*;

public class KnightsTour {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[][] chess=new int[n][n];
        int row=sc.nextInt();
        int col=sc.nextInt();
        
        chess[row][col]=1;
        printKnightsTour (chess,row,col,1);
    }

    public static void printKnightsTour(int[][] chess, int row, int col, int cnt) {
        if (cnt==Math.pow(chess.length,2)) {
            displayBoard (chess);
            return;
        } else {
            if (isSafe(chess,row-2,col+1)) {
                chess[row-2][col+1]=++cnt;
                printKnightsTour (chess,row-2,col+1,cnt);
                cnt--;
                chess[row-2][col+1]=0;
            }
            if (isSafe(chess,row-1,col+2)) {
                chess[row-1][col+2]=++cnt;
                printKnightsTour (chess,row-1,col+2,cnt);
                cnt--;
                chess[row-1][col+2]=0;
            }
            if (isSafe(chess,row+1,col+2)) {
                chess[row+1][col+2]=++cnt;
                printKnightsTour (chess,row+1,col+2,cnt);
                cnt--;
                chess[row+1][col+2]=0;
            }
            if (isSafe(chess,row+2,col+1)) {
                chess[row+2][col+1]=++cnt;
                printKnightsTour (chess,row+2,col+1,cnt);
                cnt--;
                chess[row+2][col+1]=0;
            }
            if (isSafe(chess,row+2,col-1)) {
                chess[row+2][col-1]=++cnt;
                printKnightsTour (chess,row+2,col-1,cnt);
                cnt--;
                chess[row+2][col-1]=0;
            }
            if (isSafe(chess,row+1,col-2)) {
                chess[row+1][col-2]=++cnt;
                printKnightsTour (chess,row+1,col-2,cnt);
                cnt--;
                chess[row+1][col-2]=0;
            }
            if (isSafe(chess,row-1,col-2)) {
                chess[row-1][col-2]=++cnt;
                printKnightsTour (chess,row-1,col-2,cnt);
                cnt--;
                chess[row-1][col-2]=0;
            }
            if (isSafe(chess,row-2,col-1)) {
                chess[row-2][col-1]=++cnt;
                printKnightsTour (chess,row-2,col-1,cnt);
                cnt--;
                chess[row-2][col-1]=0;
            }
            return;
        }
    }
    
    static boolean isSafe (int[][] chess, int row, int col) {
        if (row<0 || col<0 || row>=chess.length || col>=chess.length) {
            return false;
        }
        if (chess[row][col]!=0) {
            return false;
        }
        return true;
    } 

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}