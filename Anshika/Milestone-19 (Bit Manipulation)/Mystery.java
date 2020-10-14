//https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/mystery-31/

import java.util.*;


class Mystery {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner (System.in);
        while (sc.hasNextLong()) {
            long n=sc.nextLong();

            long a=n&(n-1);
            n=n^a;
            System.out.println (n);
        }

    }
}
