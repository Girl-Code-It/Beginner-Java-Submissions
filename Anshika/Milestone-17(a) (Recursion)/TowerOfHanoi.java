//https://www.pepcoding.com/resources/online-java-foundation/introduction-to-recursion/toh-official/ojquestion#

import java.io.*;
import java.util.*;

public class TowerOfHanoi {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        int d=sc.nextInt();
        int h=sc.nextInt();
        
        toh (n,s,h,d);
    }

    public static void toh(int n, int s, int h, int d){
        if (n==1) {
            System.out.println (n+"["+s+" -> "+d+"]");
        } else {
            toh (n-1,s,d,h);
            System.out.println (n+"["+s+" -> "+d+"]");
            toh (n-1,h,s,d);
        }
    }

}