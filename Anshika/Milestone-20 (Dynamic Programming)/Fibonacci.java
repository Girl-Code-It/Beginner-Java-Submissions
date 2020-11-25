//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/fibonacci-dp-official/ojquestion

import java.io.*;
import java.util.*;

public class Fibonacci{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    int[] ar=new int[n+1];
    System.out.println (fibonacci(n,ar));
 }
 
 static int fibonacci (int n, int[] ar) {
     if (n==0) {
         return 0;
     } else if (n==1) {
         return 1;
     } else if (ar[n]!=0) {
         return ar[n];
     } else {
         return ar[n]=fibonacci(n-1,ar) + fibonacci(n-2,ar);
     }
 }

}