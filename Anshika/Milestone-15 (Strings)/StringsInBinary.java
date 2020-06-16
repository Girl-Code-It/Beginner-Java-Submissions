/*
 * https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/strings-in-binary-19032f82/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class StringsInBinary {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt (br.readLine());

        while (t>0)
        {
            int n=Integer.parseInt (br.readLine());
            String s=br.readLine ();
            char ch[]=s.toCharArray();

            int cnt=0;
            if (ch.length==1 && ch[0]=='1')
            cnt++;
            
            for (int i=0; i<n-1; i++)
            {
                if (ch[i]=='0')
                continue;
                else
                for (int j=i+1; j<n; j++)
                {
                    if (ch[i]=='1' && ch[j]=='1')
                    cnt++;
                }
            }

            System.out.println (cnt);

            t--;
        }


        // Write your code here

    }
}