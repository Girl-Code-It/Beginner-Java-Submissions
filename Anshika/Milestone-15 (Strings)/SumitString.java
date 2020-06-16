/*
 * https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/sumits-string/
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class SumitString {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t=Integer.parseInt (br.readLine());
        while (t>0)
        {
            boolean flag=false;
            int d1, d2;
            String s=br.readLine();
            char ch1, ch2;
            s=s.toLowerCase();
            for (int i=1; i<s.length(); i++)
            {
                ch1=s.charAt(i-1);
                ch2=s.charAt(i);
                

                d1=Math.abs((int)ch1-(int)ch2);
                

                if (d1==25)
                d1=1;
                

                if (d1!=1)
                {
                    flag=true;
                    break;
                }
            }
            if (flag==false)
            System.out.println ("YES");
            else
            System.out.println ("NO");
            t--;
        }
        // Write your code here

    }
}
