//https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/the-castle-gate-july-easy/

import java.util.*;


class TheCastleGate {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();

        while (t-->0) {
            int n=sc.nextInt();

            int cnt=0;
            for (int i=1; i<=n-1; i++) {
                for (int j=i+1; j<=n; j++) {
                    int x=i^j;
                    if (x<=n) {
                        cnt++;
                    }
                }
            }

            System.out.println (cnt);
        }

    }
}
