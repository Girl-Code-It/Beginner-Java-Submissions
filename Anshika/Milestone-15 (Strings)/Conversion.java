/*
 * https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/conversion-11/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Conversion {
    public static void main(String args[] ) throws Exception {


       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt (br.readLine());
        while (t>0)
        {
        String name = br.readLine();    
        name=name.toLowerCase();        
        char ch;    
        int val;
        String n="";
        for (int i=0; i<name.length(); i++)
        {
            ch=name.charAt(i);
            if (ch==' ')
            n=n+'$';
            else
            {
                val=(int)ch-96;
                n=n+Integer.toString(val);
            }
        }
        System.out.println (n);
        t--;
        // Write your code here
        }

    }
}