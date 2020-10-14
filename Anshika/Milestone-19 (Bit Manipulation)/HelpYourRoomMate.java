//https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/a-new-experiment/


import java.util.*;

class HelpYourRoomMate {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();

        while (t-->0) {
            int n=sc.nextInt();

            int cnt=0;
            while (n!=0) {
                n=n&(n-1);
                cnt++;
            }
            
            System.out.println (cnt);
        }

    }
}