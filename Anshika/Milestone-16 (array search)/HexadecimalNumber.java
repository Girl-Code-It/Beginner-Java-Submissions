/*
 * https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/yet-another-easy-problem-1f3273a0/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class HexadecimalNumber {
    public static void main(String args[] ) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t>0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int cnt=0;

            for (int i=a; i<=b; i++)
            {
                int sum=0;
                int temp=i;
                int store;

                while (temp!=0)
                {
                    store=temp%16;
                    temp=temp/16;
                    sum=sum+store;
                }

                int min=Math.min(i,sum);
                int hcf=1;

                for (int j=min; j>=1; j--)
                {
                    if (i%j==0 && sum%j==0)
                    {
                        hcf=j;
                        break;
                    }
                }

                if (hcf>1)
                cnt++;


            }

            System.out.println (cnt);

            t--;
        }

    }
}
