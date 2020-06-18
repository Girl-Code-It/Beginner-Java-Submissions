/*
 * https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/remove-duplicates-3/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class RemoveDuplicates {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        String n="";
        boolean flag=false;
        char ch;
        for (int i=0; i<s.length(); i++)
        {
            flag=false;
            ch=s.charAt(i);
            for (int j=0; j<n.length(); j++)
            {
                if (ch==n.charAt(j))
                {
                    flag=true;
                    break;
                }
            }
            if (flag==false)
            {
                n=n+ch;
            }
        }
        System.out.println (n);

        // Write your code here

    }
}
