/*
 * https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/caesars-cipher-1/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class CaesarCipher {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt (br.readLine());

        while (t>0)
        {
            String aa=br.readLine ();
            String bb=br.readLine ();

            char a[]=aa.toCharArray();
            char b[]=bb.toCharArray();

            boolean flag=false;
            int d, d1;

            d=(int)b[0]-(int)a[0];
            if (d<0)
            {
                d=26+d;
            }

            for (int i=1; i<a.length; i++)
            {
                d1=(int)b[i]-(int)a[i];
                if (d1<0)
                {
                    d1=26+d1;
                }

                if (d1!=d)
                {
                    flag=true;
                    break;
                }
            }

            if (flag==false)
            System.out.println (d);
            else
            System.out.println ("-1");
            
            t--;
        }

        // Write your code here

    }
}
