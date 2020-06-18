/*
 * https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/nobita-and-string-4/description/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class NobitaAndString_version2 {
    public static void main(String args[] ) throws Exception {


        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());

        while (t>0)
        {
            String s=br.readLine();
            StringTokenizer st=new StringTokenizer(s);
            String temp;
            int num=st.countTokens();
            String w[]=new String[num];
            for (int i=0; i<num; i++)
            {
                w[i]=st.nextToken();
            }

            for (int i=num-1; i>=0; i--)
            {
                System.out.print (w[i]+" ");
            }
  
            System.out.println ();
            t--;
        }

        // Write your code here

    }
}
