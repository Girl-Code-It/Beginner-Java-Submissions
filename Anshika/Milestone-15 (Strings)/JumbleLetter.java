/*
 * https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/change-string/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class JumbleLetter {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt (br.readLine());             // Reading input from STDIN
        while (t>0)
        {
            String s=br.readLine();
            String n="";
            char ch;

            for (int i=0; i<s.length(); i++)
            {
                ch=s.charAt(i);
                if (ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u'||ch=='Y'||ch=='y')
                {
                    continue;
                }

                else
                {
                    if (Character.isUpperCase (ch))
                    {
                        ch=Character.toLowerCase (ch);
                    }
                    n=n+'.'+ch;
                }
            }
            System.out.println (n);
            t--;
        }
        

        // Write your code here

    }
}
