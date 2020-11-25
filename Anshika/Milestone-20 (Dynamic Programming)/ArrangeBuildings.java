//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/arrange-buildings-official/ojquestion

import java.io.*;
import java.util.*;

public class ArrangeBuildings{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    
    long b=1, bn, s=1, sn;
    for (int i=2; i<=n; i++) {
        bn=s;
        sn=b+s;
        s=sn;
        b=bn;
    }

    long store=b+s;
    
    System.out.println (store*store);
 }


}