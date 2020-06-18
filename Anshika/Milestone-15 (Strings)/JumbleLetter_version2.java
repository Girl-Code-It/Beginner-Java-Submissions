/*
 * https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/change-string/description/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class JumbleLetter_version2 {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt (br.readLine());             // Reading input from STDIN
        while (t>0)
        {
            String s=br.readLine();
            String n="";
            char ch;
            s=s.toLowerCase();

            for (int i=0; i<s.length(); i++)
            {
                ch=s.charAt(i);
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='y')
                {
                    continue;
                }

                else
                {
                    n=n+'.'+ch;
                }
            }
            System.out.println (n);
            t--;
        }
        

        // Write your code here

    }
}