//https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/danny-and-his-loneliness/

import java.util.*;


class RajanAndOddFrequencyNumber {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();

        int[] ar=new int[2*n+1];
        for (int i=0; i<ar.length; i++) {
            ar[i]=sc.nextInt();
        }

        Arrays.sort(ar);

        int cnt=1;
        int store=ar[0];
        boolean flag=true;

        for (int i=1; i<ar.length; i++) {
            if (store==ar[i]) {
                cnt++;
            } else {
                if (cnt%2==1) {
                    System.out.print (store);
                    flag=false;
                    break;
                }
                cnt=1;
                store=ar[i];
            }
        }
        if (flag)
        System.out.println (store);

    }
}
