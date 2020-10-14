import java.io.*;
import java.util.*;
class UnsettingRsb {

    public static void main (String args[]) throws IOException {

        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter a no.");
        int n=sc.nextInt();
        
        System.out.println (Integer.toBinaryString(n));
        n=n&(n-1);
        System.out.println (Integer.toBinaryString(n));
    }
}