//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/paint-house-many-colors-official/ojquestion

import java.io.*;
import java.util.*;

public class PaintHousemanyColors {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        
        int[][] paint=new int[n][k];
        for (int i=0; i<n; i++) {
            for (int j=0; j<k; j++) {
                paint[i][j]=sc.nextInt();
            }
        }
        
        int[][] amount=new int[n][k];
        int[] ar=new int[k];
        for (int i=0; i<k; i++) {
            ar[i]=paintHouses (paint,amount,0,i,n,k);
        }
        
        Arrays.sort(ar);
        System.out.println (ar[0]);
    }
    
    static int paintHouses (int[][] paint, int[][] amount, int row, int col, int n, int k) {
        if (row==n-1) {
            return paint[row][col];
        } else if (amount[row][col]!=0) {
            return amount[row][col];
        } else {
            int x,min=0;
            boolean flag=false;
            for (int i=0; i<k; i++) {
                if (i!=col) {
                    x=paintHouses (paint,amount,row+1,i,n,k);
                    if (flag==false || x<min) {
                        min=x;
                        flag=true;
                    }
                } 
            }
            
            amount[row][col]=paint[row][col]+min;
            return amount[row][col];
        }
    }
}