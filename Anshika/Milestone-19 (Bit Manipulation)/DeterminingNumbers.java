//https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/find-the-numbers-75f24949/

import java.util.*;


class DeterminingNumbers {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();

        int[] ar=new int[n];
        for (int i=0; i<n; i++) {
            ar[i]=sc.nextInt();
        }

        Arrays.sort(ar);

        int cnt=1;
        int store=ar[0];
        int c=0;
        boolean flag=false;

        for (int i=1; i<n; i++) {
            if (store==ar[i]) {
                cnt++;
            } else {
                if (cnt==1) {
                    System.out.print (store+" ");
                    c++;
                }
                if (c==2) {
                    flag=true;
                    break;
                }
                cnt=1;
                store=ar[i];
            }
        }
        if (flag ==false && cnt==1) {
            System.out.print (store+" ");
        }


    }
}
