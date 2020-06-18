/*
 * https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/password-1/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Password_version2 {
    public static void main(String args[] ) throws Exception {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        int n=Integer.parseInt(br.readLine());

        String ar[]=new String[n];
        String s="";
        boolean  flag=false;


        for (int i=0; i<n; i++)
        {
            ar[i]=br.readLine();
        }


        for (int i=0; i<n-1; i++)
        {
            s="";

            for (int k=0; k<ar[i].length(); k++)
            {
                s=ar[i].charAt(k)+s;
            }
            for (int j=i+1; j<n; j++)
            {
                if (s.equals(ar[j]))
                {
                    flag=true;
                    break;
                }
                

            }
            if (flag==true)
            break;
        }

        int l=s.length();
        char c=s.charAt(s.length()/2);

        System.out.println (l+" "+c);

         

    }
}
