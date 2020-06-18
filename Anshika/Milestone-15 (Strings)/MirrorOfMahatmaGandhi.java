/*
 * https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/mirror-of-mahatma-gandhi/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class MirrorOfMahatmaGandhi {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t=Integer.parseInt (br.readLine());
        while (t>0)
        {
            String s=br.readLine ();
            boolean flag=false;
            char ch;

            for (int i=0; i<s.length(); i++)
            {
                ch=s.charAt(i);
                if (ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='9')
                {
                   
                    flag=true;
                    break;
                }
            }

            if (flag==true)
            {
               
            System.out.println ("NO");
            }
            else
            {
                String n="";
                for (int i=0; i<s.length(); i++)
                {
                    n=s.charAt(i)+n;
                }
            
                if (n.equals(s)==true)
                System.out.println ("YES");
                else
                System.out.println ("NO");
            }

            t--;
        }

        // Write your code here

    }
}
