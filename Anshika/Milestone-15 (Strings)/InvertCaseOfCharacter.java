/*
 * https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/invert-case-of-character/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class InvertCaseOfCharacter {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();                // Reading input from STDIN
        String n=br.readLine ();
        int x=n.indexOf(' ');
        int a=Integer.parseInt (n.substring(0,x));
        int b=Integer.parseInt (n.substring(x+1));

        a=a-1;
        b=b-1;
        char c1=s.charAt(a);
        char c2=s.charAt(b);

        if (Character.isUpperCase(c1))
        c1=Character.toLowerCase(c1);
        else
        c1=Character.toUpperCase(c1);

        if (Character.isUpperCase(c2))
        c2=Character.toLowerCase(c2);
        else
        c2=Character.toUpperCase(c2);

        s=s.substring(0,a)+c1+s.substring(a+1,b)+c2+s.substring(b+1);
        System.out.println (s);

        // Write your code here

    }
}
