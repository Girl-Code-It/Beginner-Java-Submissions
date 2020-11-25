//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/friends-pairing-official/ojquestionhttps://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/friends-pairing-official/ojquestion

import java.io.*;
import java.util.*;

public class FriendsPairing {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        
        long cnt=pairing (n);
        System.out.println (cnt);
    }
    
    static long pairing (int n) {
        if (n<=0) {
            return 0;
        } else if (n==1 || n==2) {
            return n;
        } else {
            return pairing (n-1) + pairing (n-1);
        }
    }

}