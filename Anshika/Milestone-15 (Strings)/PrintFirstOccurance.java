/*
 * https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/print-first-occurence/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class PrintFirstOccurance {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

int t=Integer.parseInt (br.readLine());
while (t>0)
{
    String s=br.readLine();
    String n="";
    char ch, ch1;
    boolean flag=false;
    for (int i=0; i<s.length(); i++)
    {
        flag=false;
        ch=s.charAt(i);
        for (int j=0; j<n.length(); j++)
        {
            ch1=n.charAt(j);
            if (ch==ch1)
            {
                flag=true;
                break;
            }
        }
        if (flag==false)
        n=n+ch;
    }
    System.out.println (n);
    t--;
}

        // Write your code here

    }
}
