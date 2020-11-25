//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/paint-house-official/ojquestion

import java.io.*;
import java.util.*;

public class PaintHouse {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        
        int[][] paint=new int[n][3];
        for (int i=0; i<n; i++) {
            for (int j=0; j<3; j++) {
                paint[i][j]=sc.nextInt();
            }
        }
        
        int[][] amount=new int[n][3];
        int[] ar=new int[3];
        for (int i=0; i<3; i++) {
            ar[i]=paintHouses (paint,amount,0,i,n);
        }
        
        Arrays.sort(ar);
        System.out.println (ar[0]);
    }
    
    static int paintHouses (int[][] paint, int[][] amount, int row, int col, int n) {
        if (row==n-1) {
            return paint[row][col];
        } else if (amount[row][col]!=0) {
            return amount[row][col];
        } else {
            int x,y;
            if (col==0) {
                x=paint[row][col] + paintHouses (paint,amount,row+1,1,n);
                y=paint[row][col] + paintHouses (paint,amount,row+1,2,n);
            } else if (col==1) {
                x=paint[row][col] + paintHouses (paint,amount,row+1,0,n);
                y=paint[row][col] + paintHouses (paint,amount,row+1,2,n);
            } else {
                x=paint[row][col] + paintHouses (paint,amount,row+1,0,n);
                y=paint[row][col] + paintHouses (paint,amount,row+1,1,n);
            }
            
            amount[row][col]=Math.min(x,y);
            return amount[row][col];
        }
    }
}