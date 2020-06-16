/*
 * https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/short-name/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class ShortName {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int k=0;
        int x=name.lastIndexOf(' ');
        for (int i=0; i<=x; i++)
        {
            if (name.charAt(i)==' ')
            {
                System.out.print (name.charAt(k)+". ");
                k=i+1;
            }
        }
        System.out.println (name.substring(k));

        // Write your code here

    }
}
