//https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/lets-shift-2-36d90caa/

import java.util.*;


class CyclicShifts {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();

        while (t-->0) {
            long n=sc.nextLong();
            int m=sc.nextInt();
            char ch=sc.next().charAt(0);

            int[] ar=new int[16];
            int x=15;
            while (n!=0) {
                ar[x]=(int)(n%2);
                n=n/2;
                x--;
            }

            if (ch=='L') {
                for (int j=1; j<=m; j++) {
                    int temp=ar[0];
                    for (int i=0; i<15; i++) {
                        ar[i]=ar[i+1];
                    }
                    ar[15]=temp;
                }
            } else {
                for (int j=1; j<=m; j++) {
                    int temp=ar[15];
                    for (int i=15; i>=1; i--) {
                        ar[i]=ar[i-1];
                    }
                    ar[0]=temp;
                }
            }

            for (int i=0; i<16; i++) {
                n=n+(long)Math.pow(2,15-i)*ar[i];
            }

            System.out.println (n);
        }

    }
}
