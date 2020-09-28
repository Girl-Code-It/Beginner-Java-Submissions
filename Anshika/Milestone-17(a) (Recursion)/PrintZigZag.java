//https://www.pepcoding.com/resources/online-java-foundation/introduction-to-recursion/print-zig-zag-official/ojquestion#

import java.io.*;
import java.util.*;

public class PrintZigZag {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        pzz(n);
    }

    public static void pzz(int n){
        if (n<=0) {
            return;
        } else {
            System.out.print (n+" ");
            pzz(n-1);
            System.out.print (n+" ");
            pzz(n-1);
            System.out.print (n+" ");
        }
        
    }

}