//https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/subham-and-binary-strings/

import java.util.*;


class ShubhamAndBinaryStrings {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt(); 

        while (t-->0) {
            int n=sc.nextInt();
            String s=sc.next();
            char[] ch=s.toCharArray();

            int cnt=0;
            for (int i=0; i<n; i++) {
                if (ch[i]=='0') {
                    cnt++;
                }
            }
            

            System.out.println (cnt);
        }

    }
}
