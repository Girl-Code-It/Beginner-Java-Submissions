//https://www.pepcoding.com/resources/online-java-foundation/introduction-to-recursion/print-increasing-official/ojquestion#

import java.io.*;
import java.util.*;

public class PrintIncreasing {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        
        printIncreasing (n);
    }

    public static void printIncreasing(int n){
         if (n==1) {
            System.out.println (n);
        } else {
            printIncreasing (n-1);
            System.out.println (n);
        }
    }

}