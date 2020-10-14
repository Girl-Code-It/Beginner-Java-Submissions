//https://www.pepcoding.com/resources/online-java-foundation/introduction-to-recursion/print-increasing-decreasing-official/ojquestion#

import java.io.*;
import java.util.*;

public class PrintIncreasingDecreasing {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        
        pdi (n);
    }

    public static void pdi(int n){
        if (n==0) {
            return;
        } else {
            System.out.println (n);
            pdi (n-1);
            System.out.println (n);
        }
    }

}