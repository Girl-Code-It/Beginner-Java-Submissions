/*
 * https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/vowels/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class VowelPhobia {
    public static void main(String args[] ) throws Exception {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt (br.readLine());
        while (t>0)
        {
            String s=br.readLine();
            int cnt=0;
            char ch; 
            for (int i=0; i<s.length(); i++)
            {
                ch=s.charAt(i);

                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                cnt++; 
            }
            System.out.println (cnt);

            t--;
        }
        // Write your code here

    }
}
