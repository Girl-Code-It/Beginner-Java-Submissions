//https://www.pepcoding.com/resources/online-java-foundation/introduction-to-recursion/print-decreasing-official/ojquestion#

import java.io.*;
import java.util.*;

public class PrintDecreasing {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        
        printDecreasing (n);
    }

    public static void printDecreasing(int n){
        if (n==1) {
            System.out.println (n);
        } else {
            System.out.println (n);
            printDecreasing (n-1);
        }
    }

}