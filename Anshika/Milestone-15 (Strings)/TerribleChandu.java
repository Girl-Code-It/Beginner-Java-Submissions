/*
 * https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/terrible-chandu/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TerribleChandu {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int t=Integer.parseInt (br.readLine());

       while (t>0)
       {
           String s=br.readLine ();
           String rev="";
           for (int i=0; i<s.length(); i++)
           {
               rev=s.charAt(i)+rev;
           }
           System.out.println (rev);
           t--;
       }

        // Write your code here

    }
}
