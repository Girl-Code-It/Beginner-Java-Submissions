//https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/hihi-and-crazy-bits/

import java.util.*;


class HihiAndCrazyBits {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner (System.in);
        long t=sc.nextLong();

        while (t-->0) {
            long n=sc.nextLong();
            long m=n+1;

            boolean flag=true;
            while (flag) {

                long x=n^m;
                //to get the bits that have flipped

                if ((x&(x-1))==0) {
                    /*checking if only one bit has been flipped or more. if one bit has been flipped then the binary no. is having only one 1 bit and others are 0. and if any binary no. has one 1 bit that mean it is a power of 2.
                    */

                    flag=false;
                    break;
                }
                m++;
            }

            System.out.println (m);
        }

    }
}
