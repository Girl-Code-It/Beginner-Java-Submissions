/*
 * https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/nobita-and-string-4/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class NobitaAndString {
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

            for (int i=0; i<num/2; i++)
            {
                temp=w[i];
                w[i]=w[num-1-i];
                w[num-1-i]=temp;
            }

            for (int i=0; i<num; i++)
            System.out.print (w[i]+" ");
            System.out.println ();
            t--;
        }

        // Write your code here

    }
}
