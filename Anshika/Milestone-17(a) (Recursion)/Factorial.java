//https://www.pepcoding.com/resources/online-java-foundation/introduction-to-recursion/factorial-official/ojquestion#

import java.io.*;
import java.util.*;

public class Factorial {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        
        System.out.println (factorial (n) );
    }

    public static int factorial(int n){
        if (n==1) {
            return 1;
        } else {
            return n * factorial (n-1);
        }
    }

}