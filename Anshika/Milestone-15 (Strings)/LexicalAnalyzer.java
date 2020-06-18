/*
 * https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/lexical-analyzer-3/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class LexicalAnalyzer {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt (br.readLine());
        int cnt=0;
        String arr[]=new String[t];
        while (t>0)
        {
            String s=br.readLine();
            boolean flag=false;
            int x=s.indexOf('=');
            String n=s.substring(0,x);

            for (int i=0; i<cnt; i++)
            {
                if (arr[i].equals(n)==true)
                {
                    flag=true;
                break;
                }
            }
            if (flag==true)
            {
                t--;
                continue;
            }
            else
            {
                arr[cnt]=n;
                cnt++;
            }
            t--;


        }

        System.out.println (cnt);
        // Write your code here

    }
}
