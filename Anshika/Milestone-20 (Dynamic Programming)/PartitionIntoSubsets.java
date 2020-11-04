//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/partition-into-subsets-official/ojquestion#

import java.io.*;
import java.util.*;

public class PartitionIntoSubsets {

   public static void main(String[] args) throws Exception {
       
       Scanner sc=new Scanner (System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
       
       System.out.println (subsets(n,k));
       
   }
   
   static long subsets (int n, int k) {
       if (n<=0) {
           return 0;
       } else if (n==k) {
           return 1;
       } else {
           return k*subsets (n-1,k) +subsets (n-1,k-1);
       }
   }
}