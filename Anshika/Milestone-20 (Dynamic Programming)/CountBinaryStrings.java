//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/count-binary-strings-official/ojquestion

import java.io.*;
import java.util.*;

public class CountBinaryStrings{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    
    int cnt=0;
    int max=(int)Math.ceil((double)n/2);
    for (int i=0; i<=max; i++) {
        cnt=cnt+countBinary (n,i,n-i+1);
    }
    System.out.println (cnt);
 }
 
 static int countBinary (int n, int i, int j) {
     if (i==0) {
         return 1;
     } else if (j==0) {
         return 0;
     } else {
         return countBinary(n,i-1,j-1) + countBinary(n,i,j-1);

     }
 }

}