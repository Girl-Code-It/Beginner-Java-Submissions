/*
 * https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/upup/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class UpUp {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s=br.readLine ();
        s=s+" ";
        
        String n="";
        int k=0;
        

        for (int i=0; i<s.length(); i++)
        {
            if (s.charAt(i)==' ')
            {
            n=n+Character.toUpperCase(s.charAt(k))+s.substring(k+1,i+1);
            k=i+1;
            }

        }
        n=n.trim();
        System.out.println (n);

        // Write your code here

    }
}
