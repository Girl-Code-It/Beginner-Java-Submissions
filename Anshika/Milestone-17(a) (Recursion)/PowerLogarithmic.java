//https://www.pepcoding.com/resources/online-java-foundation/introduction-to-recursion/power-logarithmic-official/ojquestion#

import java.io.*;
import java.util.*;

public class PowerLogarithmic {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner (System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        
        System.out.println (power(x,n));
    }

    public static int power(int x, int n){
        if (n==0) {
            return 1;
        } else {
            return x*power(x,n-1);
        }
    }

}