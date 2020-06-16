/*
 * https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/palindrome-124/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Palindrome {
    public static void main(String args[] ) throws Exception {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        int test=Integer.parseInt (br.readLine());
        while (test>0)
        {
            String s=br.readLine();
            boolean flag=false;
            for (int i=0; i<s.length()/2; i++)
            {
                if (s.charAt(i)!=s.charAt(s.length()-1-i))
                {
                    flag=true;
                    break;
                }
            }

            if (flag==false)
            System.out.println ("YES");
            else
            System.out.println("NO");

            test--;
        }
        

    }
}
